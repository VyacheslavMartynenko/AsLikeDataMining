package com.mining.martynenko.ui.main

import android.os.Bundle
import com.mining.martynenko.R
import com.mining.martynenko.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    private val layoutContainer by lazy { layout_container }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(layoutContainer.id, MainFragment())
    }
}
