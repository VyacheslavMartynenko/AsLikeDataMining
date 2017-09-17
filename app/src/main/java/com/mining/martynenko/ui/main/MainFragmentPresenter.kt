package com.mining.martynenko.ui.main

import android.util.Log
import com.mining.martynenko.ui.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainFragmentPresenter<V : MainMvpView> @Inject constructor() : BasePresenter<V>(), MainMvpPresenter<V> {
    override fun getApplicationInfo(id: Int) {
        compositeDisposable.add(
                dataManager
                        .getApplicationInfo(id)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe { it.results.forEach { Log.e("Description", it.description) } })
    }
}