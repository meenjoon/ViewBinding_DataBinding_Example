package com.example.viewbinding_databinding_example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding_databinding_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnViewbinding.setOnClickListener {
            startActivity(Intent(this@MainActivity,ViewBinding::class.java))
        }
        binding.btnViewbindingViewmodel.setOnClickListener {
            startActivity(Intent(this@MainActivity,ViewBinding_ViewModel::class.java))
        }
        binding.btnViewbindingViewmodelLivedata.setOnClickListener {
            startActivity(Intent(this@MainActivity,ViewBinding_ViewModel_LiveData::class.java))
        }
        binding.btnDatabiding.setOnClickListener {
            startActivity(Intent(this@MainActivity,DataBinding::class.java))
        }
        binding.btnDatabidingViewmodel.setOnClickListener {
            startActivity(Intent(this@MainActivity,DataBinding_ViewModel::class.java))
        }
        binding.btnDatabidingViewmodelLivedata.setOnClickListener {
            startActivity(Intent(this@MainActivity,DataBinding_ViewModel_LiveData::class.java))
        }
    }
}
