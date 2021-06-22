package com.example.foodstore.ui.auth.signin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.foodstore.R
import com.example.foodstore.databinding.FragmentSignInBinding
import com.example.foodstore.ui.auth.AuthActivity


class SignInFragment : Fragment() {

    private lateinit var _binding: FragmentSignInBinding
    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AuthActivity).toolbarSignIn()
        binding.btnSignIn.setOnClickListener {
           val toSignIn =  SignInFragmentDirections.actionFragmentSignInToSignUpSuccessFragment()
            view.findNavController().navigate(toSignIn)
        }
        binding.btnSignUp.setOnClickListener {
            val toSignUp = SignInFragmentDirections.actionFragmentSignInToFragmentSignUp()
            view.findNavController().navigate(toSignUp)
        }
    }
}