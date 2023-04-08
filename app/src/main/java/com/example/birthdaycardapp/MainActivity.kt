package com.example.birthdaycardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Createit(view: View) { //Nameinput.OnClickListener()
        var name= Nameinput.editableText.toString()
        Toast.makeText(this, "Button is presed by $name", Toast.LENGTH_SHORT).show()
        //Toast.makeText(this, "Button is pressed ", Toast.LENGTH_LONG).show()
        val intent= Intent(this,GreetingCard::class.java)
        intent.putExtra(GreetingCard.BirthdayName,name)
        startActivity(intent)
    }
}