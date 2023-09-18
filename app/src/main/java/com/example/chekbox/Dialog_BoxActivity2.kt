package com.example.chekbox

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.nio.file.attribute.AclEntry.Builder

class Dialog_BoxActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_box2)


        val nextpage=findViewById<Button>(R.id.nextpage)
        nextpage.setOnClickListener {
            val intent=Intent(this,Layout_DialodActivity2::class.java)
            startActivity(intent)
        }


        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            onBackPressed()
        }
        val button=findViewById<Button>(R.id.Button)
        button.setOnClickListener {
            showDialogBox()
        }
    }
    @SuppressLint("SuspiciousIndentation")
    fun showDialogBox(){
    val alertDialog=AlertDialog.Builder(this)
        alertDialog.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
            onBackPressed()
        })
        alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"welcome to my page",Toast.LENGTH_SHORT).show()
        })

    val dialog=alertDialog.create()
     dialog.setTitle("Gretting")
        dialog.setMessage("*good morning*")
        dialog.show()

    }

}

//        val button=findViewById<Button>(R.id.Button)
//        button.setOnClickListener {
//            showDialogBox()
//        }
//        }
//    fun showDialogBox(){
//        val alertDialogBuilder=AlertDialog.Builder(this)
//        val dialog=alertDialogBuilder.create()
//        dialog.setTitle("Greeting")
//        dialog.setMessage("good aftoon sonu raj")
//        dialog.show()
//    }
//}