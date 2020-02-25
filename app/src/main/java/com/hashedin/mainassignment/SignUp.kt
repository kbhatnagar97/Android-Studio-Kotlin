package com.hashedin.mainassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val mob = mobile_number.text.toString()

        button1.setOnClickListener()
        {
            val activityHandler = RetroClass().getAPIInstance()
            val getToken = activityHandler.usersignup("phone", mob)
            getToken.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    if (response.isSuccessful) {
                        Log.e("Successful", "OTP Sent")
                    }
                    else
                    {
                        Log.e("Failed", "OTP was not sent")
                    }
                }
            })
        }

        button2.setOnClickListener()
        {


            if(true)
            {
                val intent = Intent(this,sign_up2::class.java)
                startActivity(intent)
                Toast.makeText(this, "OTP entered is correct", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "OTP entered is incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
