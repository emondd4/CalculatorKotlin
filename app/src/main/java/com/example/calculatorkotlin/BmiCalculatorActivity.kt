package com.example.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class BmiCalculatorActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

        var Input1 = findViewById<EditText>(R.id.heightInput) as EditText
        var Input2 = findViewById<EditText>(R.id.weightInput) as EditText
        var Result = findViewById<TextView>(R.id.result_bmi) as TextView
        var Result_Category = findViewById<TextView>(R.id.result_bmi_category) as TextView
        var CalculateBmi = findViewById<Button>(R.id.calculate_bmi) as Button
        var ClearBmi = findViewById<Button>(R.id.clear_bmi) as Button

        CalculateBmi.setOnClickListener {
            var i1 = Input1.text.toString().toDouble()
            var i2 = Input2.text.toString().toDouble()

            var bmi = 0.0

            if (i1 != 0.0 && i2 != 0.0){
                bmi = i2 / (i1 * i1)
                Result.text = bmi.toString()
            }

            if (bmi < 16.0){
                Result_Category.text = "Severe Thinness"
            }else if (bmi > 16.0 && bmi < 17.0){
                Result_Category.text = "Moderate Thinness"
            }else if (bmi > 17.0 && bmi < 18.5){
                Result_Category.text = "Mild Thinness"
            }else if (bmi > 18.5 && bmi < 25.0){
                Result_Category.text = "Normal Thinness"
            }else if (bmi > 25.0 && bmi < 30.0){
                Result_Category.text = "OverWeight"
            }else if (bmi > 30.0 && bmi < 35.0){
                Result_Category.text = "Obese Class 1"
            }else if (bmi > 35.0 && bmi < 40.0){
                Result_Category.text = "Obese Class 2"
            }else if (bmi > 40.0){
                Result_Category.text = "Obese Class 3"
            }

        }

        ClearBmi.setOnClickListener {
            Input1.setText("")
            Input2.setText("")
            Result.text = ""
            Result_Category.text = ""
        }

    }
}