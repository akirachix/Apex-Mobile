package com.example.apex_mobile

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
        setContentView(binding.root)

    }
}