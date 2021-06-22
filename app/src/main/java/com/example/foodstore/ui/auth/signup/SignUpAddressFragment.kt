package com.example.foodstore.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.foodstore.databinding.FragmentSignUpAddressBinding
import com.example.foodstore.ui.auth.AuthActivity


class SignUpAddressFragment : Fragment() {


    private lateinit var _binding: FragmentSignUpAddressBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSignUpAddressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AuthActivity).toolbarSignUpAddress()

        binding.btnSignUp.setOnClickListener {
            val toSignIn = SignUpAddressFragmentDirections.actionFragmentSignUpAddressToSignUpSuccessFragment()
            view.findNavController().navigate(toSignIn)

        }

    }


}