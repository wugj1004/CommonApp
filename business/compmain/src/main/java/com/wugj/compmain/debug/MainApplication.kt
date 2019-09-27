package com.wugj.compmain.debug

import com.wugj.common.BaseApplication
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
class MainApplication : BaseApplication<MutableList<CompMainAppLike>>(){


    override fun onCreate() {

        addAppLike(mutableListOf(CompMainAppLike()))

        super.onCreate()
    }


}