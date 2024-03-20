package com.example.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast



class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val bnt = findViewById<Button>(R.id.button)
        bnt.setOnClickListener {
            val edit = findViewById<EditText>(R.id.editTextText)
            edit.text.toString().length
            val edit2 = findViewById<EditText>(R.id.editTextTextPassword3)
            edit2.text.toString().length

            if (edit.length()==0){
                Toast.makeText(applicationContext,"아이디를 확인해주세요", Toast.LENGTH_LONG).show()
            }
//            else if (edit.length()!==0){
//                val edit_Text = findViewById<EditText>(R.id.editTextText)
//                val strData = edit_Text.text.toString()
//                val intent=Intent(this,HomeAcivity::class.java)
//                intent.putExtra ("id", edit.text)
//                startActivity(intent)
//            }
            else if(edit2.length()==0){
                Toast.makeText(applicationContext,"비밀번호를 확인해주세요", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, HomeAcivity::class.java)
                startActivity(intent)
            }


        }
        val bnt2 = findViewById<Button>(R.id.button2)
        bnt2.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}