package com.aayush.implicitintent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        -----------SHARING URL----------------------
//        var intent= Intent(Intent.ACTION_VIEW)
//        intent.setData(Uri.parse("http://www.google.com"))
//        startActivity(intent)
//        ---------------------------------
//        ---------SHARING TEXT WITH APPS ------------------------
//        val intent = Intent(Intent.ACTION_SEND)
//        intent.type = "text/plain"
//        intent.putExtra(Intent.EXTRA_SUBJECT, "My application name")
//        intent.putExtra(Intent.EXTRA_TEXT, "This is my text")
//        startActivity(Intent.createChooser(intent, "choose one"))
//        -------------------------------------------------------------
//        ------------------OPENING WITH DIAL---------------------------
//        var intent=Intent(Intent.ACTION_DIAL)
//        startActivity(intent)
//        ----------------OPENING EMAIL----------------------
//
//        val emailIntent = Intent(Intent.ACTION_SEND)
//        emailIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//        emailIntent.type = "vnd.android.cursor.item/email"
//        emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("abc@xyz.com"))
//        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "My Email Subject")
//        emailIntent.putExtra(Intent.EXTRA_TEXT, "My email content")
//        startActivity(Intent.createChooser(emailIntent, "Send mail using..."))
//        --------------------------------------------------------------------------
//                OPENING MESSAGES APP
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
        startActivity(intent)
    }
}