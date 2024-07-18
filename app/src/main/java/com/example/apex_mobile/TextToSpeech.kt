package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityTextToSpeechBinding

class TextToSpeech : AppCompatActivity() {
    lateinit var binding : ActivityTextToSpeechBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextToSpeechBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textBackSpeech.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        binding.imageLayout.setOnClickListener {
            val intent = Intent(this, MenuLayout::class.java)
            startActivity(intent)
        }



    }
}