package com.example.newproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.newproject.databinding.FragmentLoginBinding
class Login : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding5:FragmentLoginBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        binding5.b1.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_login_to_welcome))
        binding5.b2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_login_to_welcome))
        return binding5.root
    }


}