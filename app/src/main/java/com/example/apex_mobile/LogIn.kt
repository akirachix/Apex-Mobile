package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivityLogInBinding

class LogIn : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signIn.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        binding.buttonLogIn.setOnClickListener {
            validateLogIn()
        }

    }

    fun validateLogIn() {
        deleteErrors()
        var pageError = false
        val name = binding.etUserName2.text.toString()
        if (name.isBlank()) {
            pageError = true
            binding.tilUserName2.error = getString(R.string.username_is_required)
        }

        val passwordLogin = binding.etPassword.text.toString()
        if (passwordLogin.isBlank()) {
            pageError = true
            binding.tilPasswaord.error = getString(R.string.password_is_requred)
        }

    }

    fun deleteErrors() {
        binding.tilUserName2.error = null
        binding.tilPasswaord.error = null
    }
}


