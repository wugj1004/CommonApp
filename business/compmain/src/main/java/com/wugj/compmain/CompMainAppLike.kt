package com.wugj.compmain

import android.content.Context
import android.util.Log
import com.wugj.common.BaseAppLike

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/25
 * </br>
 * version:
 */
class CompMainAppLike: BaseAppLike(){

    val tag = CompMainAppLike::class.java.simpleName

    override fun onCreate(context: Context) {


        Log.e(tag,"CompMain onCreate")
    }

}