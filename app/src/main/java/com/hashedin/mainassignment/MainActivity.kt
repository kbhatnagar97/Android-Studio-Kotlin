package com.hashedin.mainassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var images: Array<Int> = arrayOf(R.drawable.carousel1,R.drawable.carousel2,R.drawable.carousel3)
    var adapter: PagerAdapter = SliderAdapter(this, images)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter = adapter
    }
}
