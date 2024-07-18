package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityExtentionsBinding

class Extentions : AppCompatActivity() {
    lateinit var binding: ActivityExtentionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExtentionsBinding.inflate(layoutInflater)

        binding.scenariomenu.setOnClickListener {
            val intent = Intent(this, MenuLayout::class.java)
            startActivity(intent)
        }
        binding.translorback.setOnClickListener {
            val intent = Intent(this, LevelApex::class.java)
            startActivity(intent)
        }
        binding.textViewBraille.setOnClickListener {
            val intent = Intent(this, BrailleExention::class.java)
            startActivity(intent)
        }

    }
}