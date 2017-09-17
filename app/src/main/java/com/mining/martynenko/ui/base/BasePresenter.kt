package com.mining.martynenko.ui.base

abstract class BasePresenter<V : MvpView> : MvpPresenter<V> {
    var mvpView: V? = null

    override fun onAttach(view: V) {
        mvpView = view
    }

    override fun onDetach() {
        mvpView = null
    }

    override fun getView(): V? = mvpView
}