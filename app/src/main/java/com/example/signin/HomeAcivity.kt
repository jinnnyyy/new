package com.example.signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeAcivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_acivity)

//        val id = intent.getStringExtra("id")
//        val editText = findViewById<EditText>(R.id.editTextText)
//        editText.setText((id))

        val btn: Button = findViewById<Button>(R.id.button4)
        btn.setOnClickListener {
            finish()
        }

    }

}