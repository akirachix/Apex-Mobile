package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityBrailleExentionBinding

class BrailleExention : AppCompatActivity() {
    lateinit var binding: ActivityBrailleExentionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrailleExentionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvWeightBlack.setOnClickListener {
            val intent = Intent(this, Translator::class.java)
            startActivity(intent)
        }
        binding.backExtension.setOnClickListener {
            val intent = Intent(this, Extentions::class.java)
            startActivity(intent)
        }
        binding.tvExtra.setOnClickListener {
            val intent = Intent(this, Translator::class.java)
            startActivity(intent)
        }
    }
}