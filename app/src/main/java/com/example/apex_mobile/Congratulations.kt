package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityCongratulationsBinding

class Congratulations : AppCompatActivity() {
    lateinit var binding: ActivityCongratulationsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCongratulationsBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnNextLevel.setOnClickListener {
            finish()
        }
        binding.lastBack.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }


}




