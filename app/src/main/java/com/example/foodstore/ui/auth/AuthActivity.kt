package com.example.foodstore.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.foodstore.R
import com.example.foodstore.databinding.ActivityAuthBinding
import com.example.foodstore.databinding.ActivityMainBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun toolbarSignIn(){
        binding.toolbarAuth.toolbar.visibility= View.VISIBLE
        binding.toolbarAuth.toolbar.title="Sign In"
        binding.toolbarAuth.toolbar.subtitle="Find your best ever meal"
        binding.toolbarAuth.toolbar.navigationIcon= null
    }

    fun toolbarSignUp(){
        binding.toolbarAuth.toolbar.visibility= View.VISIBLE
        binding.toolbarAuth.toolbar.title="Sign Up"
        binding.toolbarAuth.toolbar.subtitle="Register and Eat"
        binding.toolbarAuth.toolbar.navigationIcon= ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_000) //resources.getDrawable(R.drawable.ic_arrow_back_000,null)
        binding.toolbarAuth.toolbar.setNavigationOnClickListener { onBackPressed() }
    }
    fun toolbarSignUpAddress(){
        binding.toolbarAuth.toolbar.visibility= View.VISIBLE
        binding.toolbarAuth.toolbar.title="Address"
        binding.toolbarAuth.toolbar.subtitle="Make sure is valid"
        binding.toolbarAuth.toolbar.navigationIcon= ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_000) //resources.getDrawable(R.drawable.ic_arrow_back_000,null)
        binding.toolbarAuth.toolbar.setNavigationOnClickListener { onBackPressed() }
    }
    fun toolbarSignUpSuccess(){
        binding.toolbarAuth.toolbar.visibility= View.GONE
    }
}