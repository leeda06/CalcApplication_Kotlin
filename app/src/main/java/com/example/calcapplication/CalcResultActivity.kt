package com.example.calcapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CalcResultActivity : androidx.appcompat.app.AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val num1 = intent.getIntExtra("num1", -1)
        val num2 = intent.getIntExtra("num2", -1)
        val op = intent.getStringExtra("op")

        if(op == "+"){

        }
    }
}