package com.example.registrasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registrasi.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)


        val name = intent.getStringExtra("nama")
        binding.textView.text = name.toString()

        val email2 = intent.getStringExtra("email")
        binding.textView2.text = email2.toString()

        val alamat2 = intent.getStringExtra("alamat")
        binding.textView3.text = alamat2.toString()

        val hp2 = intent.getStringExtra("hp")
        binding.textView4.text = hp2.toString()
        setContentView(binding.root)
    }
}