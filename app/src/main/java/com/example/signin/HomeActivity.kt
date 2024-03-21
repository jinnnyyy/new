package com.example.signin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_acivity)

//        val id = intent.getStringExtra("id")
//        val editText = findViewById<EditText>(R.id.editTextText)
//        editText.setText((id))
//        val id = intent.getStringExtra("아이디")

//        val strData =  intent.getStringExtra("dataFromMain")
//        val editText = findViewById<EditText>(R.id.edit_Text)
//        editText.setText(strData)

        val btn: Button = findViewById<Button>(R.id.button4)
        btn.setOnClickListener {
            finish()
        }

    }

}