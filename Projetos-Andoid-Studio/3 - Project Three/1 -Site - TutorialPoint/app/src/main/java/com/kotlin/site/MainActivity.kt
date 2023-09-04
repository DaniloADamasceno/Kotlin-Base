package com.kotlin.site

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled", "MissingInflatedId") // -> Anotação para suprimir o aviso de que o JavaScript está desativado
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.hide()

        val webViewTutorials = findViewById<WebView>(R.id.webviewTutorialsPoint)


        webViewTutorials.webViewClient = WebViewClient()  // ->  Adiciona um WebViewClient para que a WebView carregue a URL
        webViewTutorials.loadUrl("https://www.tutorialspoint.com/kotlin/index.htm") // -> Carrega a URL
        webViewTutorials.settings.javaScriptEnabled = true  // -> Ativar o JavaScript
        webViewTutorials.settings.domStorageEnabled = true // -> Habilitar o armazenamento local


    }
}