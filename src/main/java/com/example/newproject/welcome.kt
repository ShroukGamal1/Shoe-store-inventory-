package com.example.newproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.newproject.databinding.FragmentWelcomeBinding

class welcome : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding1:FragmentWelcomeBinding=
            DataBindingUtil.inflate(inflater,R.layout.fragment_welcome,container,false)
        binding1.button.setOnClickListener(
           Navigation.createNavigateOnClickListener(R.id.action_welcome_to_instruction))
        return binding1.root
    }

}