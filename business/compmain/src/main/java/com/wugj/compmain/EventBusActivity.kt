package com.wugj.compmain

import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.wugj.common.BaseActivity
import com.wugj.compmain.eventbus1.MyEventBus

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
        EventBus.getDefault().post(MyEventBus("123456789"))
    }

    override fun onStart() {
        super.onStart()

        EventBus.getDefault().register(this)
    }


    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }

    //主线程
    @Subscribe(threadMode = ThreadMode.MAIN,  sticky =  true, priority = 100)
    internal fun onMessageEvent(event: MyEventBus) {
        Toast.makeText(this, event.messagge, Toast.LENGTH_SHORT).show()
    }
}
