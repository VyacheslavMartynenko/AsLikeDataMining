package com.mining.martynenko.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.mining.martynenko.di.component.ActivityComponent
import com.mining.martynenko.di.component.DaggerActivityComponent
import com.mining.martynenko.di.module.ActivityModule
import com.mining.martynenko.ui.AsLikeApplication

abstract class BaseActivity : AppCompatActivity(), MvpView {
    lateinit var activityComponent: ActivityComponent
        private set

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        activityComponent = DaggerActivityComponent
                .builder()
                .activityModule(ActivityModule(this))
                .applicationComponent((application as AsLikeApplication).applicationComponent)
                .build()
    }

    fun addFragment(id: Int, fragment: BaseFragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(id, fragment)
                .commitAllowingStateLoss()
    }

    fun addFragmentWithBackStack(id: Int, fragment: BaseFragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(id, fragment)
                .addToBackStack(null)
                .commitAllowingStateLoss()
    }
}