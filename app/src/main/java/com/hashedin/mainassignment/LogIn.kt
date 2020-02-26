package com.hashedin.mainassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_in.*

class LogIn : AppCompatActivity() {

    val apiservices = RetroClass().getAPIInstance()
    val logincall = apiservices.userlogin("Hasher@123","+917837880510")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        back_button.setOnClickListener()
        {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        textView3.setOnClickListener()
        {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

    }
}
