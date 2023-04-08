package com.example.birthdaycardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.view.View
import kotlinx.android.synthetic.main.activity_greeting_card.*

class GreetingCard : AppCompatActivity() {
    companion object{
        const val BirthdayName="nametobe"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_card)
        val name=intent.getStringExtra(BirthdayName)
         Wishes.setTextColor(Color.parseColor("#BAFFFF"))
        Wishes.setText("Happy Birthday \n$name")
    }

}