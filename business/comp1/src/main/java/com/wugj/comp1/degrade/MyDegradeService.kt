package com.wugj.comp1.degrade

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/10/8
 * </br>
 * version:
 */

@Route(path = "/comp1/*")
class MyDegradeService:DegradeService{
    override fun onLost(context: Context?, postcard: Postcard?) {
        Log.e("MyDegradeService", MyDegradeService::class.java!!.getName() + " has")
    }
    override fun init(context: Context?) {
    }
}