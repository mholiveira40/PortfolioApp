package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var b1: Button
    lateinit var b2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1 = findViewById(R.id.button1)
        b1.setOnClickListener {
            val intent = Intent(
                this,
                projetos::class.java

            )
            startActivity(intent)
        }
        b2 = findViewById(R.id.button2)
        b2.setOnClickListener {
            val intent = Intent(
                this,
                contatos::class.java

            )
            startActivity(intent)

        }
    }
}