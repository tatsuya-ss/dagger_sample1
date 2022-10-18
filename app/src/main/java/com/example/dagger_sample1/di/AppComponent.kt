package com.example.dagger_sample1.di

import com.example.dagger_sample1.calculate.CalculateActivity
import dagger.Component

@Component(modules = [CountStorageModule::class])
interface AppComponent {
    fun inject(activity: CalculateActivity)
}