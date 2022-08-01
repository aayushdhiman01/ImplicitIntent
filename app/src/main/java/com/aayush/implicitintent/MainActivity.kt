package com.aayush.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aayush.implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        -----------SHARING URL----------------------
        binding.url.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("http://www.google.com"))
            startActivity(intent)
        }
//        ---------------------------------
//        ---------SHARING TEXT WITH APPS ------------------------
        binding.email.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_SUBJECT, "My application name")
            intent.putExtra(Intent.EXTRA_TEXT, "This is my text")
            startActivity(Intent.createChooser(intent, "choose one"))
        }
//        -------------------------------------------------------------
//        ------------------OPENING WITH DIAL---------------------------
        binding.dial.setOnClickListener {
            var intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
//        ----------------OPENING EMAIL----------------------
        binding.email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            emailIntent.type = "vnd.android.cursor.item/email"
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("abc@xyz.com"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "My Email Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "My email content")
            startActivity(Intent.createChooser(emailIntent, "Send mail using..."))
        }
        binding.messages.setOnClickListener {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
            startActivity(intent)
        }
    }
}
