package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val buttonCount = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.editTextTime2)
        buttonCount.setOnClickListener {
            textView2.text=textView2.toString()
            textView.text=textView.toString()
            textView+textView2

        }

    }

