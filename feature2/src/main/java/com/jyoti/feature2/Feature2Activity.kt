package com.jyoti.feature2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jyoti.feature2.di.DaggerFeatureTwoComponent
import com.jyoti.feature2.ui.feature2.Feature2Fragment
import com.jyoti.gtbase.data.DataService
import com.jyoti.gtbase.di.InjectUtils
import com.jyoti.gtbase.network.NetworkService
import javax.inject.Inject

class Feature2Activity : AppCompatActivity() {

    @Inject
    lateinit var dataService: DataService

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature2)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, Feature2Fragment.newInstance())
                .commitNow()
        }

        DaggerFeatureTwoComponent
            .builder()
            .baseComponent(InjectUtils.provideBaseComponent(application))
            .build()
            .inject(this)
        Log.d("DaggerSample_Feature2", dataService.toString())
    }
}