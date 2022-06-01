package com.jyoti.gtbase.application

import com.jyoti.gtbase.di.BaseComponent
import com.jyoti.gtbase.di.BaseComponentProvider
import com.jyoti.gtbase.di.DaggerBaseComponent
import dagger.android.DaggerApplication
import dagger.android.HasAndroidInjector

abstract class BaseApplication: DaggerApplication(), HasAndroidInjector, BaseComponentProvider {

    private lateinit var baseComponent: BaseComponent

    override fun provideBaseComponent(): BaseComponent {
        if (!this::baseComponent.isInitialized) {
            baseComponent = DaggerBaseComponent
                .builder()
                .build()
        }
        return baseComponent
    }

}