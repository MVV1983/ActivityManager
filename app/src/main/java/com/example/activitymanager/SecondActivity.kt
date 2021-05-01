package com.example.activitymanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)

        val gotoThreeAct = findViewById<Button>(R.id.goto_C)

        gotoThreeAct.setOnClickListener {
            val goHome = Intent(this, ThreeActivity::class.java)
            startActivity(goHome)
        }
    }
}