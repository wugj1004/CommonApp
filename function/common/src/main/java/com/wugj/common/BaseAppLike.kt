package com.wugj.common

import android.content.Context

/**
 * description:组件Application的初始化工作
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/24
 * </br>
 * version:
 */
abstract class BaseAppLike{

    abstract fun onCreate(context: Context)


    val MAX_PRIORITY = 10
    val MIN_PRIORITY = 1
    val NORM_PRIORITY = 5

    /**
     * 返回组件的优先级，优先级范围为[1-10]，10为最高，1为最低，默认优先级是5
     *
     * @return
     */
    fun getPriority(): Int {
        return NORM_PRIORITY
    }
}