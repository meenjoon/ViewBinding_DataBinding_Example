package com.example.viewbinding_databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.viewbinding_databinding_example.databinding.ActivityViewBindingViewModelBinding

class ViewBinding_ViewModel : AppCompatActivity() {
    private lateinit var binding : ActivityViewBindingViewModelBinding
    private val model : ViewModel_ViewBinding by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIncrease.setOnClickListener {
            model.increase()
            binding.txtNumber.text = model.getNumber()
        }
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
