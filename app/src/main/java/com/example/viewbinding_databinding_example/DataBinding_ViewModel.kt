package com.example.viewbinding_databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.viewbinding_databinding_example.databinding.ActivityDataBindingViewModelBinding

class DataBinding_ViewModel : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingViewModelBinding
    val model: ViewModel_DataBinding by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_view_model)
        binding.counter = this

        binding.txtNumber.text = model.getNumber()
    }

    fun increase() {
        model.increase()
        binding.txtNumber.text = model.getNumber()
    }
}
