package com.example.kotlinproject.baseactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.kotlinproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goIntent = Intent(this, HomeActivity::class.java)

        startbutton.setOnClickListener {
            startActivity(goIntent)
        }
    }
}