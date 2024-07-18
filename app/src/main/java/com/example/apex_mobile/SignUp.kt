package com.example.apex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apex_mobile.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvAlready.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        binding.buttonSignUp.setOnClickListener {

            validateRegistration()
        }
    }

    fun validateRegistration() {
        clearErrors()
        var formError = false
        val fullName = binding.etFullName.text.toString()
        if (fullName.isBlank()) {
            formError = true
            binding.tilfullNames.error = getString(R.string.full_names_is_required)
        }

        val userName = binding.etUsername1.text.toString()
        if (userName.isBlank()) {
            formError = true
            binding.tilUsername.error = getString(R.string.username_is_required)
        }


        val code = binding.etSchool.text.toString()
        if (code.isBlank()) {
            formError = true
            binding.tilSchool.error = getString(R.string.school_code_is_required)
        }


        val password = binding.etCreatePassword.text.toString()
        if (password.isBlank()) {
            formError = true
            binding.tilCreatePassword.error = getString(R.string.password_is_required)
        }

        val confirmPassword = binding.etConfirmPassword.text.toString()
        if (password.isBlank()) {
            formError = true
            binding.tilConfirmPassword.error = getString(R.string.password_is_required)
        }

        val email = binding.etEmail.text.toString()
        if (email.isBlank()) {
            formError = true
            binding.tilEmal.error = getString(R.string.email_is_requred)
        }


        if (password != confirmPassword) {
            formError = true
            binding.tilConfirmPassword.error =
                getString(R.string.password_does_not_match_confirmed_password)

        }
    }

    fun clearErrors() {
        binding.tilfullNames.error = null
        binding.tilUsername.error = null
        binding.tilSchool.error = null
        binding.tilCreatePassword.error = null
        binding.tilConfirmPassword.error = null
        binding.tilEmal.error = null
    }
}