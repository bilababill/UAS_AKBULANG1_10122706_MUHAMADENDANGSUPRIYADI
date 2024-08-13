package com.example.utsakb_dezan.walkthrough

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.utsakb_dezan.R
import com.example.utsakb_dezan.WalkthroughPageFragment

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class WalkthroughAdapter(fragment: WalkthroughActivity) : FragmentStateAdapter(fragment) {

    private val pages = listOf(
        WalkthroughPageFragment.newInstance(R.drawable.bgwg1, "Welcome to the App"),
        WalkthroughPageFragment.newInstance(R.drawable.bgwg2, "Discover new features"),
        WalkthroughPageFragment.newInstance(R.drawable.bgwg3, "Get Started Now")
    )

    override fun getItemCount(): Int = pages.size

    override fun createFragment(position: Int): Fragment = pages[position]
}
