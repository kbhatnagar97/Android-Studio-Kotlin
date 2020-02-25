package com.hashedin.mainassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

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
