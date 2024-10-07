package com.example.lab_32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var number1: Int = 0
    private var number2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateButton: Button = findViewById(R.id.generateButton)
        val sumButton: Button = findViewById(R.id.sumButton)
        val diffButton: Button = findViewById(R.id.diffButton)
        val numbersTextView: TextView = findViewById(R.id.numbersTextView)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        generateButton.setOnClickListener {
            number1 = Random.nextInt(1, 100)
            number2 = Random.nextInt(1, 100)
            numbersTextView.text = "Numbers: $number1 and $number2"
        }

        sumButton.setOnClickListener {
            val sum = number1 + number2
            resultTextView.text = "Result: Sum = $sum"
        }

        diffButton.setOnClickListener {
            val difference = number1 - number2
            resultTextView.text = "Result: Difference = $difference"
        }
    }
}
