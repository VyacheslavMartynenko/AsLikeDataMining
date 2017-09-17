package com.mining.martynenko.ui.base

import com.mining.martynenko.data.DataManager
import javax.inject.Inject

abstract class BasePresenter<V : MvpView> : MvpPresenter<V> {
    @Inject lateinit var dataManager: DataManager
    private var mvpView: V? = null

    override fun onAttach(view: V) {
        mvpView = view
    }

    override fun onDetach() {
        mvpView = null
    }

    override fun getView(): V? = mvpView
}