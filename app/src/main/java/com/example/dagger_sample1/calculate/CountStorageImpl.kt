package com.example.dagger_sample1.calculate

import javax.inject.Inject

class CountStorageImpl @Inject constructor() : CountStorage {
    override fun getUnreadCount(): Int {
        return 10
    }

    override fun getSystemUnreadCount(): Int {
        return 20
    }

    override fun setUnreadCount(number: Int) {
        println(number)
    }
}