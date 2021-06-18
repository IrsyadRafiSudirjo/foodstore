package com.example.foodstore.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.foodstore.MainActivity
import com.example.foodstore.R
import com.example.foodstore.databinding.ActivitySplashScreenBinding
import com.example.foodstore.ui.auth.AuthActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(mainLooper).postDelayed(
            {
            startActivity(Intent(this,AuthActivity::class.java))
            },3000)
    }
}