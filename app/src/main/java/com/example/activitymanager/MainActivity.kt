package com.example.activitymanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val gotoSecondAct = findViewById<Button>(R.id.goto_B)

        gotoSecondAct.setOnClickListener {
            val intentStart = Intent(this, SecondActivity::class.java)
            startActivity(intentStart)
        }
    }

}