package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tax = Tax()
        val currentIncome = tax.calculateIncome(100.0,0.1)
        val currentTax = tax.calculateTex(100.0,0.1)
    }
}