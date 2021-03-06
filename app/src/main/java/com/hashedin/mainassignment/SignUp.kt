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

        back_button.setOnClickListener()
        {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val mob = mobile_number.text.toString()
        val otp = otp.text.toString()
        var flagGenerate : Int = 0
        var flagVerify : Int = 0

        button1.setOnClickListener()
        {
            val activityHandler = RetroClass().getAPIInstance()
            val getToken = activityHandler.usersignup("phone", mob)
            getToken.enqueue(object : Callback<String> {
                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.e("Failed", "OTP was not sent")
                }

                override fun onResponse(call: Call<String>, response: Response<String>) {
                    if (response.isSuccessful) {
                        Log.e("Successful", "OTP Sent")
                        flagGenerate = 1
                    }
                    else
                    {
                        Log.e("Failed", "OTP was not sent")
                    }
                }
            })
            if(flagGenerate == 1)
            {
                val intent = Intent(this,sign_up2::class.java)
                startActivity(intent)
                Toast.makeText(this, "OTP Generated", Toast.LENGTH_SHORT).show()
                flagGenerate = 0
            }
            else
            {
                Toast.makeText(this, "OTP Could not be generated", Toast.LENGTH_SHORT).show()
            }
        }

        button2.setOnClickListener()
        {
            val activityHandler = RetroClass().getAPIInstance()
            val getToken = activityHandler.verifyotp("otp",otp)
            getToken.enqueue(object : Callback<String> {
                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.e("Failed", "OTP Incorrect")
                }

                override fun onResponse(call: Call<String>, response: Response<String>) {
                    if (response.isSuccessful) {
                        flagVerify = 1
                        Log.e("Successful", "OTP Correct")
                    }
                    else
                    {
                        flagVerify = 1
                        Log.e("Failed", "OTP Incorrect")
                    }
                }
            })

            if(flagVerify == 1)
            {
                val intent = Intent(this,sign_up2::class.java)
                startActivity(intent)
                Toast.makeText(this, "OTP entered is correct", Toast.LENGTH_SHORT).show()
                flagVerify = 0
            }
            else
            {
                Toast.makeText(this, "OTP entered is incorrect", Toast.LENGTH_SHORT).show()
            }
        }

        text3.setOnClickListener()
        {
            if(true)
            {
//                val intent = Intent(this,sign_up2::class.java)
//                startActivity(intent)
                Toast.makeText(this, "The OTP could not be generated again", Toast.LENGTH_SHORT).show()
                flagGenerate = 0
            }
        }
    }
}
