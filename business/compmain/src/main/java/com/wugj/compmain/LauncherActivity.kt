package com.wugj.compmain

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.launcher.ARouter
import com.wugj.common.BaseActivity
import com.wugj.common.interfaces.MyProvider
import com.wugj.compmain.eventbus1.MyEventBus

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/25
 * </br>
 * version:
 */
class LauncherActivity :BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity_main)

        test()
    }

    internal fun jump(view: View){
//        System.out.println("调用comp1中的服务：${(ARouter.getInstance().build("/comp1/hello").navigation() as MyProvider).sayHello("mike")}")
        ARouter.getInstance().build("/comp1/main").navigation()
//        startActivity(Intent(this,EventBusActivity::class.java))
    }

    fun test(){

        MyEventBus("123").showLog()

    }
}