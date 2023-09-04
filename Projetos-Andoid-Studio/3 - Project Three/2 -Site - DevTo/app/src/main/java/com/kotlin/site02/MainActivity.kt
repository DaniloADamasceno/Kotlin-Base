package com.kotlin.site02

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

        val webViewTutorials = findViewById<WebView>(R.id.webViewDevTo)


        webViewTutorials.webViewClient = WebViewClient()  // ->  Adiciona um WebViewClient para que a WebView carregue a URL
        webViewTutorials.loadUrl("https://dev.to/envoy_/150-badges-for-github-pnk") // -> Carrega a URL
        webViewTutorials.settings.javaScriptEnabled = true  // -> Ativar o JavaScript
        webViewTutorials.settings.domStorageEnabled = true // -> Habilitar o armazenamento local

    }
}