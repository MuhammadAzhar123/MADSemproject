package com.example.madfinalexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Search_Vehicle_Btn.setOnClickListener {
            val search_btn_clicked = Intent(this,SearchVehicleActivity::class.java)
            startActivity(search_btn_clicked)
        }

        Sell_Vehicle_Btn.setOnClickListener {
            val sell_btn_clicked = Intent(this,SellVehicleActivity::class.java)
            startActivity(sell_btn_clicked)
        }
    }
}
