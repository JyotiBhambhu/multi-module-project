package com.jyoti.multimoduleproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.jyoti.feature2.Feature2Activity
import com.jyoti.gtbase.data.DataService
import com.jyoti.gtbase.network.NetworkService
import com.jyoti.gtbase.ui.BaseActivity
import com.jyoti.multimoduleproject.ui.main.MainFragment
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var dataService: DataService

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        Log.d("DaggerSample_Main", dataService.toString())
        startActivity(Intent(this,Feature2Activity::class.java))
    }
}