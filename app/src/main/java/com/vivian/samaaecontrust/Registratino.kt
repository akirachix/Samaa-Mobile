package com.vivian.samaaecontrust

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vivian.samaaecontrust.databinding.ActivityRegistratinoBinding

class Registratino : AppCompatActivity() {
    lateinit var binding: ActivityRegistratinoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistratinoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncontinue.setOnClickListener {
            var Err = false
            val phonen = binding.etphone.text.toString()
            if (phonen.isBlank()) {
                Err = true
                binding.tlphone.error = "Number required"

            }
          else{
              intent=Intent(this,Verification::class.java)
                startActivity(intent)
            }

        }
    }
}
