package com.wugj.common

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.ObservableOnSubscribe
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/24
 * </br>
 * version:
 */

open class BaseApplication<T: MutableList<out BaseAppLike>> :Application(){

    lateinit var appLikes : T

    override fun onCreate() {
        super.onCreate()

        initRouter()
        for (like in appLikes){
            like.onCreate(this)
        }
    }

    fun addAppLike(appLike: T){
        this.appLikes = appLike
    }

    private fun initRouter(){
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug()
            ARouter.openLog()
        }
        ARouter.init(this)
    }

    private fun test(){


        Observable.create<String> { object:ObservableOnSubscribe<String>{
            override fun subscribe(emitter: ObservableEmitter<String>) {

                emitter.onNext("通知")
            }
        }}.subscribe(object:Observer<String>{
            override fun onComplete() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onSubscribe(d: Disposable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onNext(t: String) {
                System.out.println(t)
            }

            override fun onError(e: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}



