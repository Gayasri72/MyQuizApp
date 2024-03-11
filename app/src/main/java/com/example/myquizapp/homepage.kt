package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        val singlePlayer : TextView = findViewById(R.id.textsingleplayer)


        singlePlayer.setOnClickListener{

                val intent = Intent(this,QuizQuestionsActivity::class.java)

                startActivity(intent)
                finish()
            }

    }
}