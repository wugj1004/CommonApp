package com.wugj.compmain

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.wugj.common.BaseActivity
import com.wugj.compmain.event.BaseEvent
import com.wugj.compmain.event.MyEventBus
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * description:
 *
 * author: wugj
 *
 * date: 2019/9/30
 *
 * version:
 */
class EventBusActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_event)





    }


    fun postEvent(v :View){
//        EventBus.getDefault().post(MyEventBus("主线程发送事件"))
//
        object:Thread(){
            override fun run() {
                super.run()
                EventBus.getDefault().post(MyEventBus("子程发送事件"))
            }
        }.start()

    }

    override fun onStart() {
        super.onStart()
        //注册事件
        EventBus.getDefault().register(this@EventBusActivity)

    }


    override fun onDestroy() {
        super.onDestroy()
        //注销事件
        EventBus.getDefault().unregister(this)
    }

    //订阅事件
    //主线程
    @Subscribe(threadMode = ThreadMode.POSTING,  sticky =  false, priority = 100)
    internal fun onSubscriber(event: MyEventBus) {

        Log.e(EventBusActivity::class.java.simpleName+"111",event.messagge)

        runOnUiThread {

            Toast.makeText(this,"喜爱",Toast.LENGTH_SHORT).show()
        }
        //阻塞事件传递
        EventBus.getDefault().cancelEventDelivery(event)
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND,  sticky =  false, priority = 50)
    internal fun onSubscriber1(event: MyEventBus) {
        Log.e(EventBusActivity::class.java.simpleName+"222",event.messagge)
    }


    @Subscribe(threadMode = ThreadMode.MAIN,  sticky =  false, priority = 10)
    internal fun onSubscriber2(event: BaseEvent) {
        Log.e(EventBusActivity::class.java.simpleName+"333",event.priority.toString())
    }








}
