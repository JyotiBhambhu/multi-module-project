package com.jyoti.multimoduleproject.di

import android.app.Application
import com.jyoti.gtbase.di.BaseComponent
import com.jyoti.multimoduleproject.application.MMTApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@AppScoped
@Component(
    dependencies = [BaseComponent::class],
    modules = [AndroidInjectionModule::class,
        ActivitiesBindingModule::class, AppModule::class]
)
interface AppComponent: AndroidInjector<MMTApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application):
                AppComponent.Builder
        fun baseComponent(baseComponent: BaseComponent):
                AppComponent.Builder
        fun build(): AppComponent
    }
}