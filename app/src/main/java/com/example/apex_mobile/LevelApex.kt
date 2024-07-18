package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityLevelApexBinding

class LevelApex : AppCompatActivity() {
    lateinit var binding: ActivityLevelApexBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelApexBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textBackSpeech.setOnClickListener {
            val intent = Intent(this, Extentions::class.java)
            startActivity(intent)
        }
        binding.scenariomenu.setOnClickListener {
            val intent = Intent(this, MenuLayout::class.java)
            startActivity(intent)
        }
        binding.translorback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}