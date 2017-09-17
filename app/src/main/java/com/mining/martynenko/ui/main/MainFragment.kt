package com.mining.martynenko.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mining.martynenko.R
import com.mining.martynenko.ui.base.BaseFragment
import com.mining.martynenko.utils.inflate
import javax.inject.Inject

class MainFragment : BaseFragment(), MainMvpView {
    @Inject
    lateinit var mainMvpPresenter: MainMvpPresenter<MainMvpView>

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        fragmentComponent.inject(this)
        mainMvpPresenter.onAttach(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_main)
    }

    override fun onDetach() {
        super.onDetach()
        mainMvpPresenter.onDetach()
    }
}