package com.example.calculatorkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

    }

    private fun init() {
        var BasicCalculator = findViewById<Button>(R.id.button) as Button
        var BMICalculator = findViewById<Button>(R.id.button1) as Button
        var TipCalculator = findViewById<Button>(R.id.button2) as Button

        BasicCalculator.setOnClickListener {
            startActivity(Intent(this,BasicCalculatorActivity::class.java))
        }

        BMICalculator.setOnClickListener {
            startActivity(Intent(this,BmiCalculatorActivity::class.java))
        }

        TipCalculator.setOnClickListener {
            Toast.makeText(this,"Button 2",Toast.LENGTH_SHORT).show()
        }
    }

}