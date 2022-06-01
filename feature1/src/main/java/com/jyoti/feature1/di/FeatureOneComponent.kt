package com.jyoti.feature1.di

import com.jyoti.gtbase.di.ActivityScoped
import com.jyoti.gtbase.di.BaseComponent
import dagger.Component

@ActivityScoped
@Component(dependencies = [BaseComponent::class], modules = [Feature1Module::class])
interface FeatureOneComponent {
}