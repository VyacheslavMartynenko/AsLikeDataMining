package com.mining.martynenko.ui.base

import com.mining.martynenko.data.DataManager
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BasePresenter<V : MvpView> : MvpPresenter<V> {
    @Inject lateinit var dataManager: DataManager
    @Inject lateinit var  compositeDisposable: CompositeDisposable

    private var mvpView: V? = null

    override fun onAttach(view: V) {
        mvpView = view
    }

    override fun onDetach() {
        compositeDisposable.dispose()
        mvpView = null
    }

    override fun getView(): V? = mvpView
}