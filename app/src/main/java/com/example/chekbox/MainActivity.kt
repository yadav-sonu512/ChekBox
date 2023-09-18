package com.example.chekbox

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val name = findViewById<CheckBox>(R.id.Kotlin)
        val pankaj = findViewById<CheckBox>(R.id.java)

        val sonu= findViewById<Button>(R.id.mohit)
        val yadav=findViewById<RatingBar>(R.id.guddu)

        val yadubanshi=findViewById<Button>(R.id.lalipup)
        val View=findViewById<Button>(R.id.julli)

        val kumar=findViewById<Button>(R.id.nextpage)
        kumar.setOnClickListener {

            val intent=Intent(this,helloActivity2::class.java)
//            intent.putExtra("sonu","heelo")
            startActivity(intent)

        }

        button.setOnClickListener {
            if (name.isChecked == true && pankaj.isChecked == true) {
                Toast.makeText(this, "Kotlin+java", Toast.LENGTH_SHORT).show()
            } else if (name.isChecked == true) {
                Toast.makeText(this, "Kotlin", Toast.LENGTH_SHORT).show()
            } else if (pankaj.isChecked == true) {
                Toast.makeText(this, "java", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Nothing Select in your Box", Toast.LENGTH_SHORT).show()
            }

        }

        
        sonu.setOnClickListener {

            Toast.makeText(this,"Rating-:", Toast.LENGTH_SHORT).show()
        }

    }
//    fun lalu(v:View) {
//        if (v.id==R.id.julli){
//            Toast.makeText(this,"my name is",Toast.LENGTH_SHORT).show()
//        }
    }




