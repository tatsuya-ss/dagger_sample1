package com.example.dagger_sample1.di

import com.example.dagger_sample1.calculate.CountStorage
import com.example.dagger_sample1.calculate.CountStorageImpl
import dagger.Binds
import dagger.Module

@Module
abstract class CountStorageModule {
    @Binds
    abstract fun provideCountStorage(countStorage: CountStorageImpl): CountStorage
}