package com.kotlin.one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val buttonTela = findViewById<Button>(R.id.buttonTopo)

        buttonTela.setOnClickListener() {
            irParaTela2()
        }
    }

    private fun irParaTela2() {
        val secondActivity = Intent(this, SecondActivity::class.java)
        ContextCompat.startActivity(this, secondActivity, null)
    }
}

