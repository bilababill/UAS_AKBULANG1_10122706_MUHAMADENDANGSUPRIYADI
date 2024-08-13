package com.example.utsakb_dezan.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.utsakb_dezan.R
import com.example.utsakb_dezan.databinding.FragmentHomeBinding

//Dezan Daffa Ramadhan
//10120270
//IF-7

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }
}
