package com.hashedin.mainassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up2.*

class sign_up2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)

        back_button.setOnClickListener()
        {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

        button1.setOnClickListener()
        {
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
        }

        text2.setOnClickListener()
        {
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
        }
    }
}
