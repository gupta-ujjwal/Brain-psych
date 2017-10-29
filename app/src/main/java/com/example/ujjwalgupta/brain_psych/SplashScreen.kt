package com.example.ujjwalgupta.brain_psych

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.TextView


/**
 * Created by ujjwalgupta on 29/10/17.
 */
class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val text: TextView = findViewById(R.id.quote)
        var q : String = a().Quotes()
        text.text="- "+q+" "

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}

