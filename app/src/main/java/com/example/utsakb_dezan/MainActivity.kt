package com.example.utsakb_dezan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.utsakb_dezan.daily.DailyFragment
import com.example.utsakb_dezan.databinding.ActivityMainBinding
import com.example.utsakb_dezan.gallery.GalleryFragment
import com.example.utsakb_dezan.home.HomeFragment
import com.example.utsakb_dezan.media.MediaFragment
import com.example.utsakb_dezan.profile.ProfileFragment

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment(), getString(R.string.title_home))

        binding.bottomNavigationView.background = null
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> replaceFragment(HomeFragment(), getString(R.string.title_home))
                R.id.daily -> replaceFragment(DailyFragment(), getString(R.string.title_daily))
                R.id.gallery -> replaceFragment(GalleryFragment(), getString(R.string.title_gallery))
                R.id.media -> replaceFragment(MediaFragment(), getString(R.string.title_media))
                R.id.profile -> replaceFragment(ProfileFragment(), getString(R.string.title_profile))
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_host_fragment_activity_main, fragment)
        fragmentTransaction.commit()
        supportActionBar?.title = title
    }
}
