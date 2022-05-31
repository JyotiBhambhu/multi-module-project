package com.jyoti.gtbase.di

import android.app.Application

object InjectUtils {

    private lateinit var baseComponent: BaseComponent

    fun provideBaseComponent(application: Application): BaseComponent{
        if(!this::baseComponent.isInitialized){
            baseComponent = DaggerBaseComponent.builder().build()
            baseComponent.inject(application)
        }

        return baseComponent
    }
}