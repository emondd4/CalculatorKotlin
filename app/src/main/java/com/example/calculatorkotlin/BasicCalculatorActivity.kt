package com.example.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BasicCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_calculator)

        var Input1 = findViewById<EditText>(R.id.input1) as EditText
        var Input2 = findViewById<EditText>(R.id.input2) as EditText
        var Result = findViewById<TextView>(R.id.result) as TextView
        var Add = findViewById<Button>(R.id.add) as Button
        var Sub = findViewById<Button>(R.id.sub) as Button
        var Mul = findViewById<Button>(R.id.mul) as Button
        var Div = findViewById<Button>(R.id.div) as Button
        var Clear = findViewById<Button>(R.id.clear) as Button


        Add.setOnClickListener {

            var i1 = Input1.text.toString()
            var i2 = Input2.text.toString()

            var temp1 = i1.toDouble()
            var temp2 = i2.toDouble()

            if (temp1 != 0.0 && temp2 != 0.0){
                Result.text = "%.2f".format(temp1 + temp2)
            }
        }

        Sub.setOnClickListener {

            var i1 = Input1.text.toString()
            var i2 = Input2.text.toString()

            var temp1 = i1.toDouble()
            var temp2 = i2.toDouble()

            if (temp1 != 0.0 && temp2 != 0.0){
                Result.text = "%.2f".format(temp1 - temp2)
            }
        }

        Mul.setOnClickListener {

            var i1 = Input1.text.toString()
            var i2 = Input2.text.toString()

            var temp1 = i1.toDouble()
            var temp2 = i2.toDouble()

            if (temp1 != 0.0 && temp2 != 0.0){
                Result.text = "%.2f".format(temp1 * temp2)
            }
        }

        Div.setOnClickListener {

            var i1 = Input1.text.toString()
            var i2 = Input2.text.toString()

            var temp1 = i1.toDouble()
            var temp2 = i2.toDouble()

            if (temp1 != 0.0 && temp2 != 0.0){
                Result.text = "%.2f".format(temp1 / temp2)
            }
        }

        Clear.setOnClickListener {
            Input1.setText("")
            Input2.setText("")
            Result.setText("0")
        }



    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}