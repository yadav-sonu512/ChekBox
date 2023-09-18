package com.example.chekbox

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class Layout_DialodActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_dialod2)

        val backButton=findViewById<ImageView>(R.id.back)
        val name=findViewById<EditText>(R.id.name)
        val username=findViewById<EditText>(R.id.username)
        val password=findViewById<EditText>(R.id.password)
        val button=findViewById<Button>(R.id.Button)
        button.setOnClickListener {
            val intent=Intent(this,DataActivity2::class.java)
            intent.putExtra("text","${name.text}")
            intent.putExtra("text1","${username.text}")
            intent.putExtra("text2","${password.text}")
            startActivity(intent)
        }

        backButton.setOnClickListener {
            onBackPressed()
        }

    }
}