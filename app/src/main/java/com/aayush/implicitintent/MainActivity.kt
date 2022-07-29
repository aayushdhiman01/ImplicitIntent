package com.aayush.implicitintent

import android.content.Intent
import android.net.Uri
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
        

    }
}