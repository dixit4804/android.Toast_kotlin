package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
   private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button=findViewById<Button>(R.id.showToast)
        button.setOnClickListener {
            Toast.makeText(this,"toast successfull",Toast.LENGTH_SHORT).show()
        }
    }
}