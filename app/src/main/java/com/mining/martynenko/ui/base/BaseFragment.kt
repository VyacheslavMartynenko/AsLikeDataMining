package com.mining.martynenko.ui.base

import android.content.Context
import android.support.v4.app.Fragment
import com.mining.martynenko.di.component.DaggerFragmentComponent
import com.mining.martynenko.di.component.FragmentComponent
import com.mining.martynenko.di.module.FragmentModule
import com.mining.martynenko.ui.AsLikeApplication

abstract class BaseFragment : Fragment(), MvpView {
    lateinit var fragmentComponent: FragmentComponent
        private set

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        fragmentComponent = DaggerFragmentComponent
                .builder()
                .fragmentModule(FragmentModule(this))
                .applicationComponent((activity.application as AsLikeApplication).applicationComponent)
                .build()
    }
}