package com.example.utsakb_dezan.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class ProfileViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is profile Fragment"
    }
    val text: LiveData<String> = _text
}