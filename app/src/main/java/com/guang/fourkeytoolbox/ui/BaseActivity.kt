package com.guang.fourkeytoolbox.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.guang.fourkeytoolbox.MyApplication

open class BaseActivity: AppCompatActivity() {
    inline fun <reified T> startActivity(block: Intent.() -> UInt) {
        val intent = Intent(MyApplication.context, T::class.java)
        intent.block()
        MyApplication.context.startActivity(intent)
    }
}