package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityMenuLayoutBinding

class MenuLayout : AppCompatActivity() {
    lateinit var binding: ActivityMenuLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewBraille.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        binding.tvArticlesMain.setOnClickListener {
            val intent = Intent(this, Articles::class.java)
            startActivity(intent)
        }
        binding.tvCourses.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        binding.tvProfile.setOnClickListener {
            val intent = Intent(this, ProfileInfo::class.java)
            startActivity(intent)
        }
        binding.menuBack.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}