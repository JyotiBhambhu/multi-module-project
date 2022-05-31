package com.jyoti.gtbase.di

import android.app.Application
import com.jyoti.gtbase.data.DataService
import com.jyoti.gtbase.network.NetworkService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BaseModule::class])
interface BaseComponent {
    fun inject(app: Application)
    fun getDataService(): DataService
    fun getNetworkService(): NetworkService
}
