package com.example.newproject

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.newproject.databinding.AddviewBinding
import com.example.newproject.databinding.FragmentShoelistBinding

class shoelist : Fragment() {
    private val viewmodel: ShoeVeiw by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentShoelistBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoelist, container, false)
        binding.lifecycleOwner = this
        viewmodel.shoeList.observe(viewLifecycleOwner) {

            //   binding.FM.removeAllViews()
            for (shoe in it) {
                val binding1: AddviewBinding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.addview, container, false
                )
                binding1.shoename.text = shoe.name
                binding1.shoecolor.text = shoe.description
                binding1.shoecountry.text = shoe.company
                binding1.shoesize.text = shoe.size.toString()


                binding.List.addView(binding1.root)


            }
        }
        setHasOptionsMenu(true)
        binding.addbutton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoelist_to_shoedetail)
        )
        //make the stack defualt to be empty
        findNavController().popBackStack(R.id.shoelist,false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       // return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
         //       || super.onOptionsItemSelected(item)
          when(item.itemId){
            R.id.Login->
                findNavController().navigate(R.id.action_shoelist_to_login)
        }
        return super.onOptionsItemSelected(item)
    }

    }
