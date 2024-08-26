package com.example.loginpage

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tombolLogin.setOnClickListener {
            val text = binding.username.text.toString()
            Toast.makeText(this, "Selamat Datang "+text, Toast.LENGTH_SHORT).show()
        }
    }
}
