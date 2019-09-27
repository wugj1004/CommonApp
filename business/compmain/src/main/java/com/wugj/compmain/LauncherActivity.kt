package com.wugj.compmain

import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.launcher.ARouter
import com.wugj.common.BaseActivity

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/25
 * </br>
 * version:
 */
class LauncherActivity :BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity_main)

    }

    public fun jump(view: View){
        ARouter.getInstance().build("/comp1/main").navigation()
    }

    fun text(){



    }
}