package com.example.tpiticmas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.newFixedThreadPoolContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val comp1: EditText = findViewById(R.id.compare1)
        val comp2: EditText = findViewById(R.id.compare2)
        val resultText: TextView = findViewById(R.id.compareResult)
        val resultButton= findViewById<Button>(R.id.btnCompare)

        resultButton.setOnClickListener {
            if (comp1.getText().toString().compareTo(comp2.getText().toString(),ignoreCase = true)==0)
                resultText.setText("Correcto! El texto ingresado es identico")
            else
                resultText.setText("El texto ingresado NO coincide")


        }
    }
}