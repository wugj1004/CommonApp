package com.wugj.comp1

import android.content.Context
import android.util.Log
import com.wugj.common.BaseAppLike

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/24
 * </br>
 * version:
 */
class Component1AppLike : BaseAppLike() {

    val tag = Component1AppLike::class.java.simpleName

    override fun onCreate(context: Context) {

        Log.e(tag,"Comp1 onCreate")
    }


}