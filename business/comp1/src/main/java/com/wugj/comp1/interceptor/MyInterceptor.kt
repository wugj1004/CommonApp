package com.wugj.comp1.interceptor

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor

/**
 * description: Arouter定义拦截器
 * </br>
 * author: wugj
 * </br>
 * date: 2019/10/8
 * </br>
 * version:
 */

@Interceptor(name = "myInterceptor" , priority = 2)
class MyInterceptor :IInterceptor{
    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {

        Log.e("MyInterceptor", MyInterceptor::class.java!!.getName() + " has process")

        callback!!.onContinue(postcard)
    }

    override fun init(context: Context?) {
        Log.e("MyInterceptor", MyInterceptor::class.java!!.getName() + " has init.")
    }

}