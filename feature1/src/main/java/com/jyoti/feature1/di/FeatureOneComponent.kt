package com.jyoti.feature1.di

import com.jyoti.feature1.Feature1Activity
import com.jyoti.gtbase.di.ActivityScoped
import com.jyoti.gtbase.di.BaseComponent
import dagger.Component

@ActivityScoped
@Component(dependencies = [BaseComponent::class], modules = [Feature1Module::class])
interface FeatureOneComponent {
    fun inject(activity: Feature1Activity)
}