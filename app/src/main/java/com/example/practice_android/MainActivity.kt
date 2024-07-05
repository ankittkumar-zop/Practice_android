package com.example.practice_android

import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        val toolbar = findViewById<Toolbar>(R.id.toolbar)
////        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayShowTitleEnabled(true)
//        supportActionBar?.title= "Welcome"
    }
}