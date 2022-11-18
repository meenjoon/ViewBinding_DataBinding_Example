package com.example.viewbinding_databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewbinding_databinding_example.databinding.ActivityDataBindingBinding

class DataBinding : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)
        binding.counter = this
        binding.txtNumber.text = number.toString()
    }

    fun increase(){
        number++
        binding.txtNumber.text = number.toString()
    }
}
