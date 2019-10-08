package com.wugj.comp1.interfaces

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.wugj.common.interfaces.MyProvider

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/10/8
 * </br>
 * version:
 */

@Route(path = "/comp1/hello", name = "测试服务")
class HelloImpl : MyProvider {

    override fun init(context: Context?) {
    }

    override fun sayHello(name: String):String {

        return StringBuffer(name).append("名字修改了").toString()
    }

}