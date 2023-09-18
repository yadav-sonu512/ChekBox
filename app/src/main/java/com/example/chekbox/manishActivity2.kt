package com.example.chekbox

import android.annotation.SuppressLint
import android.content.Intent
import android.location.Address
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class manishActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manish2)
        var message = 0
        var toast=0
        val heading=findViewById<TextView>(R.id.heading)
        val back=findViewById<ImageView>(R.id.back)
        val username = findViewById<EditText>(R.id.username)
        val geocoder=findViewById<LinearLayout>(R.id.gender)
        val Address = findViewById<EditText>(R.id.Address)
        val password=findViewById<EditText>(R.id.password)
        val id = findViewById<TextView>(R.id.text)
        val button = findViewById<Button>(R.id.btm)


        back.setOnClickListener {
            onBackPressed()
        }

        button.setOnClickListener {

            username.addTextChangedListener {
                heading.text=it.toString()
                id.text = it.toString()
                Toast.makeText(this, "" + it.toString(), Toast.LENGTH_SHORT).show()
            }
            Address.addTextChangedListener {
                heading.text=it.toString()

                Toast.makeText(this,""+it.toString(),Toast.LENGTH_SHORT).show()
            }
            password.addTextChangedListener {
                heading.text=it.toString()
                Toast.makeText(this,""+it.toString(),Toast.LENGTH_SHORT).show()
            }

          button.setOnClickListener {
              val textname=username.text.toString()
              message++
              id.text="guddu"+message
              Toast.makeText(this,textname,Toast.LENGTH_SHORT).show()

              val intent = Intent(this, Dialog_BoxActivity2::class.java)
              startActivity(intent)

          }
        }
    }
}