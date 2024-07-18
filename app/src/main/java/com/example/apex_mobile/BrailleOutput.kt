package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityBrailleOutputBinding

class BrailleOutput : AppCompatActivity() {
    lateinit var binding: ActivityBrailleOutputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrailleOutputBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnFinish.setOnClickListener {
            val intent = Intent(this, Congratulations::class.java)
            startActivity(intent)
        }
    }
}
