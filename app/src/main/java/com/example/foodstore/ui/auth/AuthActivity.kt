package com.example.foodstore.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodstore.databinding.ActivityAuthBinding
import com.example.foodstore.databinding.ActivityMainBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)    }
}