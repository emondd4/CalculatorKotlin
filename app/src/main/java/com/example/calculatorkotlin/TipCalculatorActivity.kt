package com.example.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TipCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_calculator)

        var Input = findViewById<EditText>(R.id.TipInput) as EditText
        var Percentage = findViewById<EditText>(R.id.TipPercentage) as EditText
        var Result = findViewById<TextView>(R.id.TipResult) as TextView
        var Calculate = findViewById<Button>(R.id.TipButton) as Button
        var Clear = findViewById<Button>(R.id.TipClear) as Button

        Calculate.setOnClickListener {
            var I1 = Input.text.toString().toDouble()
            var I2 = Percentage.text.toString().toDouble()

            var tip = 0.0

            if (I1 != 0.0 && I2 != 0.0){

                tip = String.format("%.2f", (I1 * (I2 / 100))).toDouble()
                Result.text = tip.toString()

            }


        }

        Clear.setOnClickListener {
            Input.setText("")
            Percentage.setText("")
            Result.text = ""
        }

    }
}