package com.example.appmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class SecondActivity : AppCompatActivity() {

    private lateinit var btnReturn: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnReturn = findViewById(R.id.btnReturn)
    }

    private fun initListeners() {
        btnReturn.setOnClickListener(){
            Toast.makeText(this, "( ﾟдﾟ)つ ¡Adiós!", Toast.LENGTH_LONG).show()
            finish()
        }
    }


}