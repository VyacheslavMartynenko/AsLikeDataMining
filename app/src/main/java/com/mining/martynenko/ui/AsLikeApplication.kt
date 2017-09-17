package com.mining.martynenko.ui

import android.app.Application
import com.mining.martynenko.di.component.DaggerApplicationComponent
import com.mining.martynenko.di.module.ApplicationModule

class AsLikeApplication : Application() {
    val applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
}