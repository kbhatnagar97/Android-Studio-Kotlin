package com.hashedin.mainassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LogIn : AppCompatActivity() {

    val apiservices = RetroClass().getAPIInstance()
    val logincall = apiservices.userlogin("Hasher@123","+917837880510")
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

    }
}
