package com.kotlin.two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.kotlin.ptwo.R

class LogoMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo_main)

        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
<<<<<<< HEAD
            val intent = Intent(this@LogoMainActivity, LoginPageActivity::class.java)
=======
            val intent = Intent(this@LogoMainActivity, LoguinPageActivity::class.java)
>>>>>>> 85bbc49f7770d2443dac216ae0cd124998fc08cd
            startActivity(intent)
        }, 5000)
    }
}