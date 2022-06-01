package com.jyoti.feature1

import android.os.Bundle
import android.util.Log
import com.jyoti.feature1.ui.feature1.Feature1Fragment
import com.jyoti.gtbase.data.DataService
import com.jyoti.gtbase.network.NetworkService
import com.jyoti.gtbase.ui.BaseActivity
import javax.inject.Inject

class Feature1Activity : BaseActivity() {

    @Inject
    lateinit var dataService: DataService

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, Feature1Fragment.newInstance())
                .commitNow()
        }
        Log.d("DaggerSample_Feature1", dataService.toString())

    }
}