package com.example.dagger_sample1.calculate

import javax.inject.Inject

class Calculation @Inject constructor(private val numberStorage: CountStorage) {
    fun getTotalCount(): Int {
        return numberStorage.getUnreadCount() + numberStorage.getSystemUnreadCount()
    }
}