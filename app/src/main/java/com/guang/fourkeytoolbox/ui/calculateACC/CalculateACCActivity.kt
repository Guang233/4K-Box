package com.guang.fourkeytoolbox.ui.calculateACC

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar
import com.guang.fourkeytoolbox.R
import com.guang.fourkeytoolbox.ui.BaseActivity

class CalculateACCActivity : BaseActivity() {
    private val toolBar: MaterialToolbar by lazy { findViewById(R.id.normal_title_toolbar) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculate_acc)
       // toolBar.title ="计算段位单曲acc"
    }
}