package com.example.viewbinding_databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.viewbinding_databinding_example.databinding.ActivityViewBindingViewModelLiveDataBinding

class ViewBinding_ViewModel_LiveData : AppCompatActivity() {
    private lateinit var binding: ActivityViewBindingViewModelLiveDataBinding
    private val model: ViewModel_ViewBinding_LiveData by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingViewModelLiveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIncrease.setOnClickListener {
            model.increase()
        }

        model.getNumber().observe(this, Observer { number ->
            binding.txtNumber.text = number.toString()
        })

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
