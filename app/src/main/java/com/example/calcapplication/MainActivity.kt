package com.example.calcapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1Text = findViewById<EditText>(R.id.num1)
        val num2Text = findViewById<EditText>(R.id.num2)
        val plusButton = findViewById<Button>(R.id.plus)
        plusButton.setOnClickListener {
            val num1Str = num1Text.text.toString()
            val num2Str = num2Text.text.toString()
            if(num1Str.isNotBlank() && num2Str.isNotBlank()) {
                val num1 = num1Text.text.toString().trim().toInt()
                val num2 = num2Text.text.toString().trim().toInt()

                val intent = Intent(this, CalcResultActivity::class.java)
                intent.putExtra("num1", num1)
                intent.putExtra("num2", num2)
                intent.putExtra("op", "+")

                startActivity(intent)
            } else {
                Toast.makeText(this, "잘못된 입력값",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}