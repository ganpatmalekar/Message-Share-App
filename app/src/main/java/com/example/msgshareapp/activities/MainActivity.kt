package com.example.msgshareapp.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.msgshareapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowText.setOnClickListener{
            //Code
            Log.i("MainActivity", "Button was clicked !")
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_LONG).show()
        }

        //Explicit Intent
        btnSendMessageToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }

        //Implicit Intent
        btnShareToOtherApps.setOnClickListener {
            val message: String = etUserMessage.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to: "))
        }

        //Recycler and Cardview Demo
        btnRecyclerViewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}