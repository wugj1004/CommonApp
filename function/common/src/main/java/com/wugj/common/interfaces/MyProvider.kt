package com.wugj.common.interfaces

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/10/8
 * </br>
 * version:
 */
interface MyProvider :IProvider{


    fun sayHello(name:String):String
}