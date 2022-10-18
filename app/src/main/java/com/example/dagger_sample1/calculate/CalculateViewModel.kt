package com.example.dagger_sample1.calculate

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class CalculateViewModel @Inject constructor(private val calculation: Calculation) {
    private val _totalCountData = MutableLiveData<String>()
    val totalCountData = _totalCountData

    fun onCreate() {
        _totalCountData.value = calculation.getTotalCount().toString()
    }
}