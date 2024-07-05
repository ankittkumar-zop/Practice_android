package com.example.practice_android

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

data class UserLoginInfo(val userId: String , val password:String)

class MainActivity : AppCompatActivity() {

    private val userLoginInfoList = mutableListOf<UserLoginInfo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        val toolbar = findViewById<Toolbar>(R.id.toolbar)
////        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayShowTitleEnabled(true)
//        supportActionBar?.title= "Welcome"

        val usernameEditText : EditText = findViewById(R.id.loginId)
        val passwordEditText : EditText = findViewById(R.id.passwordId)
        val loginButton: Button = findViewById(R.id.LoginButton)

        loginButton.setOnClickListener{
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if ( username.isNotBlank() && password.isNotBlank() ){
                val user = UserLoginInfo(username, password)
                userLoginInfoList.add(user)

                usernameEditText.text.clear()
                passwordEditText.text.clear()
            }
            else {
                Toast.makeText(this, "Enter details", Toast.LENGTH_SHORT).show()
            }
        }
    }
}