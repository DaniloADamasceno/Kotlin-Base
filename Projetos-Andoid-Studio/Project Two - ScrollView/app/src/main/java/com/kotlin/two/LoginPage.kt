package com.kotlin.two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
    }

    val buttonEntrar = findViewById<Button>(R.id.buttonEntrar)
    val buttonCadastro = findViewById<Button>(R.id.buttonCadastro)


    buttonEntrar.setOnClickListener()
    {
        goScrollView()
    }

    buttonCadastro.setOnClickListener()
    {
        goScrollView()
    }


    private fun goScrollView() {
        val secondActivity = Intent(this, ScrollViewActivity::class.java)
        ContextCompat.startActivity(this, secondActivity, null)
    }

//    private fun goCadastro() {
//        val secondActivity = Intent(this, RegistrationPageActivity::class.java)
//        ContextCompat.startActivity(this, secondActivity, null)
//    }

}

