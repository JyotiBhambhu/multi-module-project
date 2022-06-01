package com.jyoti.feature2

import android.os.Bundle
import android.util.Log
import com.jyoti.feature2.ui.feature2.Feature2Fragment
import com.jyoti.gtbase.data.DataService
import com.jyoti.gtbase.network.NetworkService
import com.jyoti.gtbase.ui.BaseActivity
import javax.inject.Inject

class Feature2Activity : BaseActivity() {

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
        Log.d("DaggerSample_Feature2", dataService.toString())
    }
}