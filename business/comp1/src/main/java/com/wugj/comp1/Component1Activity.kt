package com.wugj.comp1

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.wugj.common.BaseActivity

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/23
 * </br>
 * version:
 */

@Route(path = "/comp1/main")
class Component1Activity : BaseActivity(){

    @Autowired
    @JvmField
    var key:String=""

    @JvmField
    @Autowired(name = "key")
    var otherKey:String=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //依赖注入是必须先声明
        ARouter.getInstance().inject(this)

        Toast.makeText(this,"组件1",Toast.LENGTH_LONG).show()
        setContentView(R.layout.comp1_activity_main)

        Log.e(Component1Activity::class.java.simpleName,"打印获取参数$key,$otherKey")
    }
}