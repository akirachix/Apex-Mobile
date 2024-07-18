package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityLevelApexBinding
import com.example.apex_mobile.databinding.ActivityScreenReaderApexBinding

class ScreenReaderApex : AppCompatActivity() {
    lateinit var binding: ActivityScreenReaderApexBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreenReaderApexBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageLayout.setOnClickListener {
            val intent = Intent(this, MenuLayout::class.java)
            startActivity(intent)
        }
        binding.textBackSpeech.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}