package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityArticlesBinding

class Articles : AppCompatActivity() {
    lateinit var binding: ActivityArticlesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArticlesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvBrailleArticle.setOnClickListener {
            val intent = Intent(this, BrailleResource::class.java)
            startActivity(intent)
        }
        binding.backArticle.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}