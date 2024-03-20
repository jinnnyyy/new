package com.example.signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val btn = findViewById<Button>(R.id.button3)

        val edit = findViewById<EditText>(R.id.editTextText2)
        edit.text.toString().length
        val edit2 = findViewById<EditText>(R.id.editTextText3)
        edit2.text.toString().length
        val edit3 = findViewById<EditText>(R.id.editTextText4)
        edit2.text.toString().length
        btn.setOnClickListener {
        if (edit.length() == 0) {
            Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다", Toast.LENGTH_LONG).show()
        } else if (edit2.length() == 0) {
            Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다", Toast.LENGTH_LONG).show()
        } else if (edit2.length() == 0) {
            Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다", Toast.LENGTH_LONG).show()
        } else {

                finish()
            }
        }
    }
}