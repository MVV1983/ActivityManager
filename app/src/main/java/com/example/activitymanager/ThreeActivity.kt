package com.example.activitymanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)

        val gotoHomeBtn = findViewById<Button>(R.id.goto_A)

        gotoHomeBtn.setOnClickListener {
            val intentStart = Intent(this, MainActivity::class.java)
            startActivity(intentStart)
        }
    }
}