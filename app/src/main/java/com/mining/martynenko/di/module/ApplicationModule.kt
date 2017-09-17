package com.mining.martynenko.di.module

import android.content.Context
import com.mining.martynenko.data.AsLikeDataManager
import com.mining.martynenko.data.DataManager
import com.mining.martynenko.data.network.ApiCall
import com.mining.martynenko.data.network.ApiHelper
import com.mining.martynenko.data.network.AsLikeApiHelper
import com.mining.martynenko.di.ApplicationContext
import com.mining.martynenko.ui.AsLikeApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val asLikeApplication: AsLikeApplication) {

    @Provides
    @ApplicationContext
    fun provideContext(): Context = asLikeApplication.applicationContext

    @Provides
    @Singleton
    fun provideDataManager(appDataManager: AsLikeDataManager): DataManager = appDataManager

    @Provides
    @Singleton
    fun provideApiHelper(appApiHelper: AsLikeApiHelper): ApiHelper = appApiHelper

    @Provides
    @Singleton
    fun provideApiCall(): ApiCall = ApiCall.Factory.create()
}