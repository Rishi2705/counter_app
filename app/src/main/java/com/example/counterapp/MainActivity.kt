package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counter:TextView
    private lateinit var button1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//connect xml and kt

        counter = findViewById<TextView>(R.id.counter)
        button1=findViewById(R.id.button1)

        var count=0


        button1.setOnClickListener {
            count++
            if (count==16){
                count=0
            }
            counter.text=count.toString()
        }
    }
}