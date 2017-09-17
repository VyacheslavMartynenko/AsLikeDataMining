package com.mining.martynenko.ui.main

import android.content.Context
import android.util.Log
import com.mining.martynenko.ui.base.BaseFragment
import javax.inject.Inject

class MainFragment : BaseFragment(), MainMvpView {
    @Inject
    lateinit var mainMvpPresenter: MainMvpPresenter<MainMvpView>

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        fragmentComponent.inject(this)
        mainMvpPresenter.onAttach(this)
    }

    override fun onResume() {
        super.onResume()
        Log.e("Test", mainMvpPresenter.getView().toString())
    }

    override fun onDetach() {
        super.onDetach()
        mainMvpPresenter.onDetach()
    }
}