package com.example.newproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.newproject.databinding.FragmentInstructionBinding

class instruction : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding3:FragmentInstructionBinding=
            DataBindingUtil.inflate(inflater,R.layout.fragment_instruction,container,false)
       binding3.b3.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_instruction_to_shoelist))
        return binding3.root
    }
    }


