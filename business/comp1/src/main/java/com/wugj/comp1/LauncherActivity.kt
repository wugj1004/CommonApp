package com.wugj.comp1

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/23
 * </br>
 * version:
 */
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import com.wugj.common.BaseActivity
import kotlin.jvm.java

class LauncherActivity : BaseActivity() {


    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, Component1Activity::class.java)
        startActivity(intent)
    }
}
