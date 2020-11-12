package com.e.digitalhousefoods.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.e.digitalhousefoods.R


class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handle = Handler()
        handle.postDelayed({ callLogin() }, 1500)
    }

    private fun callLogin() {
        val intenLogin = Intent(this, MainActivity::class.java)
        startActivity(intenLogin)
    }
}