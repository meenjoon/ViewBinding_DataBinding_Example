package com.example.viewbinding_databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding_databinding_example.databinding.ActivityViewBindingBinding

class ViewBinding : AppCompatActivity() {
    private var number = 0
    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIncrease.setOnClickListener {
            binding.txtNumber.text = number++.toString()
        }
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
