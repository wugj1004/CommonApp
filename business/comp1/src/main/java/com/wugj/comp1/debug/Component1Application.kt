package com.wugj.comp1.debug

import com.wugj.common.BaseApplication
import com.wugj.comp1.Component1AppLike


/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/24
 * </br>
 * version:
 */
class Component1Application : BaseApplication<MutableList<Component1AppLike>>(){


    override fun onCreate() {

        val instance = Component1AppLike()
        addAppLike(mutableListOf(Component1AppLike()))

        super.onCreate()
    }


}