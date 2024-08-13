package com.example.utsakb_dezan.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Gallery"
    }
    val text: LiveData<String> = _text
}