package com.example.madfinalexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Login_Btn.setOnClickListener {
            val login_btn = Intent(this,MainActivity::class.java)
            startActivity(login_btn)
        }
        Signup_Text_View.setOnClickListener {
            val signup_text_view = Intent(this,SignupActivity::class.java)
            startActivity(signup_text_view)
        }
    }
}
