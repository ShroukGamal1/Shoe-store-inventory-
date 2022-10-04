package com.example.newproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.newproject.databinding.FragmentShoedetailBinding


class shoedetail : Fragment() {

          val viewmodel :ShoeVeiw by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewmodel.resetnewshoes()
        val binding: FragmentShoedetailBinding =
            DataBindingUtil.inflate(inflater,R.layout.fragment_shoedetail,container,false)

        binding.veiwmodel= viewmodel
        binding.cancel.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoedetail_to_shoelist))
        binding.save.setOnClickListener { view: View ->
            if (viewmodel.addnewshoes()) {
              //  Log.i("msg",viewmodel.g.toString())
                Navigation.findNavController(view).navigate(R.id.action_shoedetail_to_shoelist)
            }
            else{
             //Log.i("msg",viewmodel.g.toString())
                Navigation.findNavController(view).navigate(R.id.action_shoedetail_to_shoelist)
            }
        }
        return binding.root
    }


}