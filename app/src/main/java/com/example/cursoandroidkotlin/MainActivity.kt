package com.example.cursoandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.cursoandroidkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Log.v("Mainactivity" , "main activity verbose ")
        Log.d("Mainactivity" , "main activity debug")
        Log.i("Mainactivity" , "main activity info")
        Log.e("Mainactivity" , "main activity error ")
        Log.w("Mainactivity" , "main activity warning")

        binding.button.setOnClickListener{
            val age_string = binding.AgeId.text.toString()
            if (age_string.isNotEmpty()) {
                val age_int = age_string.toInt()
                val result = age_int * 7

                binding.ResultText.text =getString(R.string.result_text,result)
            }else{
                Log.d("Mainactivity" , "age is emty ")
                Toast.makeText(this, R.string.you_must_insert_your_Age , Toast.LENGTH_SHORT).show()
            }
        }


    }
}