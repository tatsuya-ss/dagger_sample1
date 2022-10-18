package com.example.dagger_sample1.calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.dagger_sample1.MyApplication
import com.example.dagger_sample1.R
import com.example.dagger_sample1.databinding.ActivityCalculateBinding
import javax.inject.Inject

class CalculateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculateBinding

    @Inject lateinit var calculateViewModel: CalculateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as MyApplication).appComponent.inject(this)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_calculate)
        calculateViewModel.totalCountData.observe(this) {
            binding.textView.text = it
        }
        calculateViewModel.onCreate()
    }
}