package com.wugj.component

import com.alibaba.android.arouter.launcher.ARouter
import com.wugj.common.BaseAppLike
import com.wugj.common.BaseApplication
import com.wugj.comp1.Component1AppLike
import com.wugj.compmain.CompMainAppLike

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/25
 * </br>
 * version:
 */
class App :BaseApplication<MutableList<BaseAppLike>>(){

    override fun onCreate() {

        val list = mutableListOf(CompMainAppLike(),Component1AppLike())
        addAppLike(list)

        super.onCreate()

    }


}