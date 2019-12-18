package com.ten.lifecat.phone.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.ten.lifecat.phone.R

/**
 * TODO 用户设置界面
 */
class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // 导航按钮
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.mipmap.navigation)
        }

        // TODO 用户信息展示与修改
    }
}
