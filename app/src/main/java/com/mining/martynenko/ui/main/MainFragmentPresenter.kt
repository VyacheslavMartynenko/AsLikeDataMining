package com.mining.martynenko.ui.main

import com.mining.martynenko.ui.base.BasePresenter
import javax.inject.Inject

class MainFragmentPresenter<V : MainMvpView> @Inject constructor() : BasePresenter<V>(), MainMvpPresenter<V>