package com.mining.martynenko.di.component

import android.content.Context
import com.mining.martynenko.data.DataManager
import com.mining.martynenko.di.ApplicationContext
import com.mining.martynenko.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    @ApplicationContext
    fun context(): Context

    fun dataManager(): DataManager

}