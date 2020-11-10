package com.e.digitalhousefoods

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.e.digitalhousefoods.ui.MainActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*


class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handle = Handler()
        handle.postDelayed({ mostrarLogin() }, 9000)
        //vai para a Activity inicial (login)
        mostrarLogin()


    }

    private fun mostrarLogin() {
        val intenLogin = Intent(this, MainActivity::class.java)
        startActivity(intenLogin)
        finish()
    }
}