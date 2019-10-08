package com.wugj.comp1.degrade

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService
import com.wugj.comp1.interceptor.MyInterceptor

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/10/8
 * </br>
 * version:
 */

@Route(path = "/comp/*")
class MyDegradeService:DegradeService{
    override fun onLost(context: Context?, postcard: Postcard?) {

//        Toast.makeText(context, "降级", Toast.LENGTH_SHORT).show()
        Log.e("MyDegradeService", MyDegradeService::class.java!!.getName() + " has")
    }

    override fun init(context: Context?) {

    }

}