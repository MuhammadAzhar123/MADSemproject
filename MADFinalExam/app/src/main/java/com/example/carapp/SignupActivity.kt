package com.example.madfinalexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        Signup_Btn.setOnClickListener {
            val signup_btn = Intent(this,MainActivity::class.java)
            startActivity(signup_btn)
        }
    }
}
