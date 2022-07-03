package com.example.summerpractice22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private var text_Name: EditText? = null
    private var int_Height: EditText? = null
    private var decimal_Weight: EditText? = null
    private var int_Age: EditText? = null
    private var main_btn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_Name = findViewById(R.id.textName)
        int_Height = findViewById(R.id.intHeight)
        decimal_Weight = findViewById(R.id.decimalWeight)
        int_Age = findViewById(R.id.intAge)
        main_btn = findViewById(R.id.button)

        main_btn?.setOnClickListener {
            Calculate()
        }
    }

    fun Calculate() {
        val Name: Int = text_Name?.text.toString().length
        val Height: Int = int_Height?.text.toString().toInt()
        val Weight: Int = decimal_Weight?.text.toString().toInt()
        val Age: Int = int_Age?.text.toString().toInt()
        if (Name in 1..50 || Height in 1..250 || Weight in 1..250 || Age in 1..150) {
            val number = Math.abs(Name*100 - Age * (Height - Weight))
            if (number % 100 < 100) {
                Log.e("Ответ", "Ваше счаcтливое число: $number")
            } else {
                Log.e("Ответ", "Данные введены некорректно:")
            }
        }
    }
}