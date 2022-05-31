package com.jyoti.gtbase.di

import com.jyoti.gtbase.data.DataService
import com.jyoti.gtbase.network.NetworkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module()
class BaseModule{
    @Singleton
    @Provides
    fun provideDataService(): DataService{
        return DataService()
    }

    @Singleton
    @Provides
    fun provideNetworkService(): NetworkService{
        return NetworkService()
    }
}