package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils

class launcher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val backgroundImg: ImageView = findViewById(R.id.iv_logo)
        val backgroundTex: TextView = findViewById(R.id.text)

        val slideAnimationImg = AnimationUtils.loadAnimation(this, R.anim.slide)
        backgroundImg.startAnimation(slideAnimationImg)

        val slideAnimationTex = AnimationUtils.loadAnimation(this, R.anim.slide)
        backgroundTex.startAnimation(slideAnimationTex)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}
