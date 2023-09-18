package com.example.chekbox

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.chekbox.R.id.lalipup

class helloActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello2)
        var message = 0
        val kaka = findViewById<Button>(R.id.lalipup)
        val ok = findViewById<Button>(R.id.julli)
        val id=findViewById<TextView>(R.id.id)
        val kotlin=findViewById<ImageView>(R.id.back)
        val button = findViewById<Button>(R.id.Editbutton)
        val EditText = findViewById<EditText>(R.id.Edittext)
        val textView = findViewById<TextView>(R.id.textview)

        kotlin.setOnClickListener {
            onBackPressed()
        }

        EditText.addTextChangedListener {
            id.text=it.toString()
            textView.text = it.toString()
            Toast.makeText(this, "" + it.toString(), Toast.LENGTH_SHORT).show()
        }
//button.setOnClickListener {
//    val p=EditText.text.toString()
//    val l=textView.text.toString()
//    message++
//    textView.text="text"+message
//    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
//}

        button.setOnClickListener {
    val o=EditText.text.toString()
    val m=textView.text.toString()
            message++
            textView.text = "hello" + message
            Toast.makeText(this, "manish", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, manishActivity2::class.java)
            startActivity(intent)
        }

        kaka.setOnClickListener {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
        }
        ok.setOnClickListener {
            Toast.makeText(this, "good morning friend", Toast.LENGTH_SHORT).show()
        }
    }
}

