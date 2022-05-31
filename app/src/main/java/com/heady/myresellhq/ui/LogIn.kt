package com.heady.myresellhq.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.heady.myresellhq.MainActivity
import com.heady.myresellhq.databinding.ActivityLogInBinding


class LogIn : AppCompatActivity() {

    private val mAuth: FirebaseAuth? = null
    private lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSignIn.setOnClickListener {
            Toast.makeText(this, "Sign In Clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.tbtnSignUp.setOnClickListener {
            Toast.makeText(this, "Sign Un Clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }


}