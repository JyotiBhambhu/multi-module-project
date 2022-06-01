package com.jyoti.multimoduleproject.di

import com.jyoti.feature1.Feature1Activity
import com.jyoti.feature2.Feature2Activity
import com.jyoti.gtbase.di.ActivityScoped
import com.jyoti.multimoduleproject.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesBindingModule() {

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract fun contributeMainActivity(): MainActivity

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract fun contributeFeature1Activity(): Feature1Activity

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract fun contributeFeature2Activity(): Feature2Activity

}
