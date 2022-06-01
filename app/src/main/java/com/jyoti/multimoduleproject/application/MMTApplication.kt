package com.jyoti.multimoduleproject.application

import com.jyoti.gtbase.application.BaseApplication
import com.jyoti.multimoduleproject.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MMTApplication : BaseApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
            .builder()
            .application(this)
            .baseComponent(provideBaseComponent())
            .build()
    }
}