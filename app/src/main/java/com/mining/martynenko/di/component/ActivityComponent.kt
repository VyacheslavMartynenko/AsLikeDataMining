package com.mining.martynenko.di.component

import com.mining.martynenko.di.PerActivity
import com.mining.martynenko.di.module.ActivityModule
import dagger.Component

@PerActivity
@Component(modules = arrayOf(ActivityModule::class), dependencies = arrayOf(ApplicationComponent::class))
interface ActivityComponent