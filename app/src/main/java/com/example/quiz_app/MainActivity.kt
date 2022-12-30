package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var startjava: Button
    lateinit var startcpp: Button
    lateinit var startpython: Button
    lateinit var startandroid: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        startjava=findViewById(R.id.buttonJava)
        startcpp=findViewById(R.id.buttonCpp)
        startpython=findViewById(R.id.buttonPython)
        startandroid=findViewById(R.id.buttonAndroid)



        startjava.setOnClickListener {
            var intent= Intent(this,DisplayQuestions::class.java)
            startActivity(intent)
        }

        startcpp.setOnClickListener {
            var intent= Intent(this,CppQuestions::class.java)
            startActivity(intent)
        }


        startpython.setOnClickListener {
            var intent= Intent(this,PythonQuestions::class.java)
            startActivity(intent)
        }

        startandroid.setOnClickListener {
            var intent= Intent(this,AndroidQuestions::class.java)
            startActivity(intent)
        }



    }

//


    override fun onBackPressed() {
        super.onBackPressed()
    }

}