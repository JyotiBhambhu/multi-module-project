package com.jyoti.multimoduleproject.di

import com.jyoti.gtbase.di.ActivityScoped
import com.jyoti.gtbase.di.BaseComponent
import com.jyoti.multimoduleproject.MainActivity
import dagger.Component
import javax.inject.Singleton

@ActivityScoped
@Component(dependencies = [BaseComponent::class], modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}