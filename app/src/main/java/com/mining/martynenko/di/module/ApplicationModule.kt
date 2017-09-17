package com.mining.martynenko.di.module

import android.content.Context
import com.mining.martynenko.di.ApplicationContext
import com.mining.martynenko.ui.AsLikeApplication
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val asLikeApplication: AsLikeApplication) {

    @Provides
    @ApplicationContext
    fun provideContext(): Context = asLikeApplication.applicationContext
}