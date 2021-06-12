package com.example.cursoandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Age_id:EditText= findViewById<EditText>(R.id.Age_id)
        val Result_Text:TextView= findViewById<TextView>(R.id.Result_Text)
        val button:Button= findViewById<Button>(R.id.button)


        button.setOnClickListener{
            val age_string = Age_id.text.toString()
            val age_int = age_string.toInt()
            val result = age_int * 7

            Result_Text.text="tu edad es  $result en años perros"

        }


    }
}