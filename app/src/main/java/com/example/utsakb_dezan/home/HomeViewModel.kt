package com.example.utsakb_dezan.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Home"
    }
    val text: LiveData<String> = _text
}