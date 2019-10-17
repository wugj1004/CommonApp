package com.wugj.compmain

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.wugj.common.BaseActivity
import com.wugj.common.interfaces.MyProvider
import com.wugj.compmain.event.MyEventBus

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

    @JvmField
    @Autowired(name = "/comp1/hello")
    var myProvider: MyProvider? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity_main)

    }

    public fun jump(view: View){

//        byName获取服务
//        System.out.println("调用comp1中的服务：${(ARouter.getInstance().build("/comp1/hello").navigation() as MyProvider).sayHello("mike")}")

//        byType获取服务
//        ARouter.getInstance().navigation(MyProvider::class.java).sayHello("mike")

//        依赖注入获取服务
//        myProvider!!.sayHello("mike")

        //单一跳转降级处理
        ARouter.getInstance().build("/comp1/main")
                .withString("key","value")
                .navigation(this,object: NavigationCallback {
            override fun onLost(postcard: Postcard?) {
            }
            override fun onFound(postcard: Postcard?) {
            }
            override fun onInterrupt(postcard: Postcard?) {
            }
            override fun onArrival(postcard: Postcard?) {
            }
        })

//        通过Uri调用组件
//        val uri = Uri.parse("comp1://com.wugj.comp1:8888/comp1/main?key=value")
//        ARouter.getInstance().build(uri).navigation()


        //通过路径跳转
//        startActivity(Intent().setClass(this, Class.forName("com.wugj.comp1.Component1Activity")))
    }

    fun jumpEventBus(view:View){
        //显示Activity调用组件
        startActivity(Intent(this,EventBusActivity::class.java))

    }


    fun jumpRecycle(view:View){
        startActivity(Intent(this,EventBusActivity::class.java))

    }
}