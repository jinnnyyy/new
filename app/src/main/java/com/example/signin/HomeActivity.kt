package com.example.signin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import java.util.Random


class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_acivity)

        val strData = intent.getStringExtra("id")
        val editText = findViewById<EditText>(R.id.editText)
        editText?.setText(strData)

        val btn: Button = findViewById<Button>(R.id.button4)
        btn.setOnClickListener {
            finish()
        }

    }

}