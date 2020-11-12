package com.e.digitalhousefoods.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.e.digitalhousefoods.R

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configuraNavController()
    }

    private fun configuraNavController() {
        navController = findNavController(R.id.navHostFragment_mainActivity)
    }

}