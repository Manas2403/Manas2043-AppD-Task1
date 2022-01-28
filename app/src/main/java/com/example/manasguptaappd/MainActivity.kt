package com.example.manasguptaappd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.submit_btn)
        val name:TextView=findViewById(R.id.name)
        val age:TextView=findViewById(R.id.age)
        btn.setOnClickListener {
          if(name.text.toString().trim().isEmpty()){
              Toast.makeText(this,"Enter your name",Toast.LENGTH_SHORT).show()
          }else {
              Toast.makeText(
                  this,
                  "Hey,I am ${name.text.toString()}, Go Corona Go!",
                  Toast.LENGTH_LONG
              ).show()
          }
        }
    }
}
