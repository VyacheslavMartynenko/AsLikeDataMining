package com.mining.martynenko.di.module

import com.mining.martynenko.di.PerFragment
import com.mining.martynenko.ui.base.BaseFragment
import com.mining.martynenko.ui.main.MainFragmentPresenter
import com.mining.martynenko.ui.main.MainMvpPresenter
import com.mining.martynenko.ui.main.MainMvpView
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class FragmentModule(private val baseFragment: BaseFragment) {

    @Provides
    @PerFragment
    fun provideMainFragmentPresenter(presenter: MainFragmentPresenter<MainMvpView>): MainMvpPresenter<MainMvpView> = presenter

    @Provides
    @PerFragment
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()
}