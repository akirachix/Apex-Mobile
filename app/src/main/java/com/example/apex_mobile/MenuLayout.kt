package com.example.apex_mobile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityMenuLayoutBinding

class MenuLayout : AppCompatActivity() {
    lateinit var biding: ActivityMenuLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = ActivityMenuLayoutBinding.inflate(layoutInflater)
        setContentView(biding.root)
    }
}