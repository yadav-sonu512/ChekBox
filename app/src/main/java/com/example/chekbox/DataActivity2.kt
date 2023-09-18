package com.example.chekbox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class DataActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data2)

        val name=intent.extras?.getString("text")
        val getname= findViewById<EditText>(R.id.showname)
        getname.text=name

        val email=intent.extras?.getString("text1")
        val getEmail=findViewById<EditText>(R.id.showemail)
        getEmail.text=email


    }
}