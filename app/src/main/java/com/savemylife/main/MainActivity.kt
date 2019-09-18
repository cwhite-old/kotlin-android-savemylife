package com.savemylife.main

import android.os.Bundle
import com.savemylife.R
import com.savemylife.sensor.Accelerometer
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var accelerometer: Accelerometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        accelerometer.unregister()
    }
}