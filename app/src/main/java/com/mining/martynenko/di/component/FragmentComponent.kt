package com.mining.martynenko.di.component

import com.mining.martynenko.di.PerFragment
import com.mining.martynenko.di.module.FragmentModule
import com.mining.martynenko.ui.main.MainFragment
import dagger.Component

@PerFragment
@Component(modules = arrayOf(FragmentModule::class), dependencies = arrayOf(ApplicationComponent::class))
interface FragmentComponent {

    fun inject(mainFragment: MainFragment)
}