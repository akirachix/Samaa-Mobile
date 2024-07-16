package com.vivian.samaaecontrust

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vivian.samaaecontrust.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnlog.setOnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        }
        binding.btsignup.setOnClickListener {
            val intent=Intent(this,Signup::class.java)
            startActivity(intent)
        }

    }
}