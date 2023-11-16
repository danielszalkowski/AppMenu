package com.example.appmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        initComponents()
        initListeners()
    }

    private lateinit var btnOpenActivity: AppCompatButton
    private lateinit var btnShowToast: AppCompatButton
    private lateinit var btnShowSnackbar: AppCompatButton
    private lateinit var btnClose: AppCompatButton
    private lateinit var btnShowHideText: AppCompatButton

    private fun initComponents() {
        btnOpenActivity = findViewById(R.id.btnOpenActivity)
        btnShowToast = findViewById(R.id.btnShowToast)
        btnShowSnackbar = findViewById(R.id.btnShowSnackBar)
        btnClose = findViewById(R.id.btnClose)
        btnShowHideText = findViewById(R.id.btnShowHideText)
    }

    private fun initListeners() {
        btnOpenActivity.setOnClickListener() {
            val intentSA = Intent(this, SecondActivity::class.java)
            startActivity(intentSA)
        }
        btnShowToast.setOnClickListener() {
            Toast.makeText(this, "Soy un toast!", Toast.LENGTH_LONG).show()
        }
        btnShowSnackbar.setOnClickListener() {
            Snackbar.make(btnShowSnackbar, "Soy un snackbar!", Snackbar.LENGTH_SHORT)
                .setAction("X") {  }
                .show()
        }
        btnClose.setOnClickListener() {
            finishAffinity()
        }
    }

}