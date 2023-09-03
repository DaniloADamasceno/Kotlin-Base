package com.kotlin.two

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class ScrollViewPageActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view_activity)

        // Image Profile
        val imageProfile = findViewById<ImageView>(R.id.imageDefaultUser)

        // Load Image from URL using Coil --> https://coil-kt.github.io/coil/getting_started/
        // Carregar imagem da URL usando Coil --> https://coil-kt.github.io/coil/getting_started/
        imageProfile.load("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F677651075174037821%2F&psig=AOvVaw0QZ3Z4Z4Z4Z4Z4Z4Z4Z4Z4&ust=1629789858662000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJjQ4ZqHgvICFQAAAAAdAAAAABAD"){
            crossfade(true)
            placeholder(R.drawable.ic_launcher_background)

        }
    }
}