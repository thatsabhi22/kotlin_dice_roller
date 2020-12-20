package com.theleafapps.pro.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll_btn: Button = findViewById(R.id.roll_btn)
        roll_btn.text="Let's Roll"
        roll_btn.setOnClickListener{
            Toast.makeText(this,"Rolling ....",Toast.LENGTH_LONG).show()
        }

    }
}