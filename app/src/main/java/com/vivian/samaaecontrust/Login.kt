package com.vivian.samaaecontrust

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vivian.samaaecontrust.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.btnlogin.setOnClickListener {
            var Err=false
            val Name=binding.tlName.text.toString()
            if(Name.isBlank()){
                Err=true
                binding.tlinputl.error="Name required"
            }
            val Password=binding.etpassword.text.toString()
            if(Password.isBlank()){
                Err=true
                binding.tlpassword.error="Password required"
            }
            else{
                val intent=Intent(this,Signup::class.java)
                startActivity(intent)
            }
        }

    }
}