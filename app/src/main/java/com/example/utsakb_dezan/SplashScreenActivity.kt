package com.example.utsakb_dezan

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.utsakb_dezan.walkthrough.WalkthroughActivity

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val intent = Intent(this, WalkthroughActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}
