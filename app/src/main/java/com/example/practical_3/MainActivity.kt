package com.example.mad_practical_3
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.practical_3.R

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var tvRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin = findViewById(R.id.btnLogin)
        tvRegister = findViewById(R.id.tvRegister)
        btnLogin.setOnClickListener{
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
        }
        tvRegister.setOnClickListener{

            startActivity(intent)
        }
    }
}