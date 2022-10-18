package com.example.dagger_sample1.calculate

interface CountStorage {
    fun getUnreadCount(): Int
    fun getSystemUnreadCount(): Int
    fun setUnreadCount(number: Int)
}