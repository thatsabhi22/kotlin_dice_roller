package com.theleafapps.pro.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll_btn: Button = findViewById(R.id.roll_btn)
        roll_btn.text = "Let's Roll"
        roll_btn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice_iv: ImageView = findViewById(R.id.dice_iv)


        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_iv.setImageResource(drawableResource)
    }
}