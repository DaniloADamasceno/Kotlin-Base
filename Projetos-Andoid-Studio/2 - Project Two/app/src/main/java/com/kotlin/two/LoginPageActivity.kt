package com.kotlin.two

import android.content.Intent
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class LoginPageActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        //?------------------------   Buttons and their invocations --------------------------------
        val buttonEntrar = findViewById<Button>(R.id.buttonEntrar)
        val buttonCadastro = findViewById<Button>(R.id.buttonCadastro)

        buttonEntrar.setOnClickListener() {
            goScrollView()
        }

        buttonCadastro.setOnClickListener() {
            goRegistrationPage()
        }
    }

    //?--------------------------------   Functions   ----------------------------------------------
    // PÁGINA de REGISTRO
    @SuppressLint("SuspiciousIndentation")
    private fun goRegistrationPage() {
      val registrationPage = Intent(this, RegistrationActivity::class.java)
        ContextCompat.startActivity(this, registrationPage, null)

    }

    //PÁGINA de LOGIN
    private fun goScrollView() {
        val scrollView = Intent(this, ScrollViewPageActivity::class.java)
        ContextCompat.startActivity(this, scrollView, null)
    }
}