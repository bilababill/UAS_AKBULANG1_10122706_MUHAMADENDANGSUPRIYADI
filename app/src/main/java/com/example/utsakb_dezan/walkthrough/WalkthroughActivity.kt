package com.example.utsakb_dezan.walkthrough

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.utsakb_dezan.MainActivity
import com.example.utsakb_dezan.databinding.ActivityWalkthroughBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class WalkthroughActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWalkthroughBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWalkthroughBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = WalkthroughAdapter(this)
        binding.viewPager.adapter = adapter

        binding.tabLayout.tabMode = TabLayout.MODE_SCROLLABLE

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { _, _ -> }.attach()

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == adapter.itemCount - 1) {
                    binding.viewPager.isUserInputEnabled = false
                }
            }
        })

        binding.viewPager.setOnTouchListener { _, _ ->
            if (binding.viewPager.currentItem == adapter.itemCount - 1) {
                startMainActivity()
                true
            } else {
                false
            }
        }
    }

    private fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}

