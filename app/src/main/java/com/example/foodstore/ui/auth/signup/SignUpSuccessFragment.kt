package com.example.foodstore.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodstore.databinding.FragmentSignInBinding
import com.example.foodstore.databinding.FragmentSignUpSuccessBinding
import com.example.foodstore.ui.auth.AuthActivity


class SignUpSuccessFragment : Fragment() {

    private lateinit var _binding: FragmentSignUpSuccessBinding
    private val binding get() =  _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSignUpSuccessBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AuthActivity).toolbarSignUpSuccess()
    }


}