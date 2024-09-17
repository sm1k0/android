package com.example.animations

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)

        button1.setOnClickListener(object : OnClickListener() {
            @Override
            fun onClick(v: View?) {
                val intent: Intent = Intent(
                    this@MainActivity,
                    FrameAnimationActivity::class.java
                )
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }
        })

        button2.setOnClickListener(object : OnClickListener() {
            @Override
            fun onClick(v: View?) {
                val intent: Intent = Intent(
                    this@MainActivity,
                    TweenAnimationActivity::class.java
                )
                startActivity(intent)
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
            }
        })
    }
}