package com.example.registrasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.registrasi.databinding.ActivityMain2Binding
import com.example.registrasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.button2.setOnClickListener(){sendMassage()
        }
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        Log.d("lifecycle","OnCreate dimulai")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle","onStart dimulai")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle","OnResume dimulai")

    }

    override fun onPause() {
        super.onPause()
        Log.d("licecycle","OnPause dimulai")
    }

    override fun onStop() {
        super.onStop()
        Log.d("licecycle","OnStop dimulai")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("licecycle","OnDestroy dimulai")
    }
    fun sendMassage(){
        val nama2 = binding.etNama.text.toString()
        val email = binding.etEmail.text.toString()
        val alamat = binding.etAlamat.text.toString()
        val noHp = binding.etHP.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("nama",nama2)
        intent.putExtra("email", email)
        intent.putExtra("alamat", alamat)
        intent.putExtra("hp", noHp)

        startActivity(intent)
    }
}