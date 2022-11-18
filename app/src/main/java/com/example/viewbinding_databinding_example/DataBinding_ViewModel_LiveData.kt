package com.example.viewbinding_databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.viewbinding_databinding_example.databinding.ActivityDataBindingViewModelLiveDataBinding

class DataBinding_ViewModel_LiveData : AppCompatActivity() {
    private lateinit var binding : ActivityDataBindingViewModelLiveDataBinding
    private val model : ViewModel_DataBinding_LiveData by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding_view_model_live_data)
        binding.lifecycleOwner = this
        binding.viewModel = model

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
