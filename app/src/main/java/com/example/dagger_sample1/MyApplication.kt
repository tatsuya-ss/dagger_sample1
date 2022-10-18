package com.example.dagger_sample1

import android.app.Application
import com.example.dagger_sample1.di.AppComponent
import com.example.dagger_sample1.di.DaggerAppComponent

open class MyApplication: Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}