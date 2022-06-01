package com.jyoti.gtbase.di

import android.app.Application
import com.jyoti.gtbase.application.BaseApplication

object InjectUtils {

    fun provideBaseComponent(application: Application): BaseComponent {
        return (application as BaseApplication).provideBaseComponent()
    }
}