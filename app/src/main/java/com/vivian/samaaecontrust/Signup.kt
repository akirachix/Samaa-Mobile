package com.vivian.samaaecontrust

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vivian.samaaecontrust.databinding.ActivitySignupBinding

class Signup : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            var Err=false
            val firstName=binding.etfirst.text.toString()
            if(firstName.isBlank()){
                Err=true
                binding.tlfirst.error="Name required"
            }
            val lastname=binding.etlast.text.toString()
            if(lastname.isBlank()){
                Err=true
                binding.tllast.error="Password required"
            }
            val password=binding.etpass.text.toString()
            if(password.isBlank()){
                Err=true
                binding.tlpass.error="Password required"
            }

            val confirmpassword=binding.etconfirm.text.toString()
            if(confirmpassword.isBlank()){
                Err=true
                binding.tlconfirm.error="Password required"
            }

            else{
                val intent= Intent(this,Registratino::class.java)
                startActivity(intent)
            }
        }

    }
}