package com.guang.fourkeytoolbox.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.guang.fourkeytoolbox.MyApplication

open class BaseActivity: AppCompatActivity() {
    inline fun <reified T> startActivity(block: Intent.() -> UInt) {
        val intent = Intent(this, T::class.java)
        intent.block()
        startActivity(intent)
    }

    fun startActivity(clazz: Class<*>) {
        val intent = Intent(this, clazz)
        startActivity(intent)
    }
}