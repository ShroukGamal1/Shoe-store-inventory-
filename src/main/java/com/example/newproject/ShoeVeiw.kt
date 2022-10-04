package com.example.newproject

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
class ShoeVeiw : ViewModel() {
    private val shoeslist = MutableLiveData<MutableList<Shoe>>()
    val shoeList: LiveData<MutableList<Shoe>>
        get() = shoeslist
  var g:Int =0
    var newShoeName = ""
    var newShoeSize = ""
    var newCompanyName = ""
    var newShoeDescription = ""
    init {
        val defaultlist= mutableListOf<Shoe>()
        for (i in 0 until 10){
            defaultlist.add(Shoe(name = "Name$i", size = 4.0, company = "Company$i", description = "Description$i"))
        }
        shoeslist.value=defaultlist
    }
    fun validateinputs():Int{
            //Boolean{
     //   if (newShoeName.isBlank()||newShoeSize.isBlank()||newShoeDescription.isBlank()||newCompanyName.isBlank()){
       //     return false
        if(newShoeName.isBlank()){
            g=1
            return g
        }
        else if(newShoeSize.isBlank()){
            g=2
            return g
        }
        else if(newShoeDescription.isBlank()){
            g=3
            return g
        }
        else if(newCompanyName.isBlank()){
            g=4
            return g;
        }
        else{
            g=5
            return g;
        }

    }
    fun addshoes(name:String,size:Double,company:String,description:String){
        val shoes=Shoe(name,size,company,description)
        shoeslist.value!!.add(shoes)
    }
    fun addnewshoes():Boolean{
        if (validateinputs()!=5)return false
        addshoes(newShoeName,newShoeSize.toDouble(),newCompanyName,newShoeDescription)
        return true
    }
    fun resetnewshoes(){
        newShoeName=""
        newShoeSize=""
        newCompanyName=""
        newShoeDescription=""
    }
}