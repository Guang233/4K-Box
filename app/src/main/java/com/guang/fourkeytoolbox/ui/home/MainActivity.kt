package com.guang.fourkeytoolbox.ui.home


import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.guang.fourkeytoolbox.R
import com.guang.fourkeytoolbox.logic.model.FunctionItem
import com.guang.fourkeytoolbox.ui.BaseActivity

class MainActivity : BaseActivity() {
    private val toolBar: MaterialToolbar by lazy { findViewById(R.id.title_toolbar) }
    private val drawerLayout: DrawerLayout by lazy { findViewById(R.id.drawer_layout) }
    private val recyclerView: RecyclerView by lazy { findViewById(R.id.home_recyclerView) }
    private val list: MutableList<FunctionItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initList()
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = HomeAdapter(this, list)
        toolBar.setNavigationOnClickListener {
            drawerLayout.open()
        }

        onBackPressedDispatcher.addCallback(this) {
            if (drawerLayout.isDrawerOpen(GravityCompat.START))
                drawerLayout.close()
            else
                finish()
        }
    }

    private fun initList() {
        list.add(FunctionItem(0, "计算段位单曲acc", ComponentActivity::class.java))
    }
}