package com.jyoti.multimoduleproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.jyoti.feature1.Feature1Activity
import com.jyoti.gtbase.data.DataService
import com.jyoti.gtbase.network.NetworkService
import com.jyoti.multimoduleproject.ui.main.MainFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

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
        startActivity(Intent(this,Feature1Activity::class.java))
    }
}