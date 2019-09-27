package com.wugj.comp1

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.wugj.common.BaseActivity
/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/23
 * </br>
 * version:
 */

@Route(path = "/comp1/main")
class Component1Activity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this,"组件1",Toast.LENGTH_LONG).show()
        setContentView(R.layout.comp1_activity_main)
    }
}