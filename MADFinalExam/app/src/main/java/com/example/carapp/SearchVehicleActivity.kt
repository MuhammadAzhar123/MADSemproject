package com.example.madfinalexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_search_vehicle.*

class SearchVehicleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_vehicle)

        Search_Screen_Btn.setOnClickListener {
            val search_screen_btn = Intent(this,SearchedVehicleActivity::class.java)
            startActivity(search_screen_btn)
        }
    }
}
