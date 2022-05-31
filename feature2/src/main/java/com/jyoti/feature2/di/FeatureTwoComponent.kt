package com.jyoti.feature2.di

import com.jyoti.feature2.Feature2Activity
import com.jyoti.gtbase.di.ActivityScoped
import com.jyoti.gtbase.di.BaseComponent
import dagger.Component

@ActivityScoped
@Component(dependencies = [BaseComponent::class], modules = [FeatureTwoModule::class])
interface FeatureTwoComponent {
    fun inject(activity: Feature2Activity)
}