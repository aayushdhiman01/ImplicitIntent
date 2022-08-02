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



//        ------------------OPENING WITH DIAL---------------------------
        binding.dial.setOnClickListener {
            val phone = "+1234567890"
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))
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
//            val intent = Intent(Intent.ACTION_MAIN)
//            intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
//            startActivity(intent)
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("sms:9876543210")
            startActivity(intent)
        }
    }
}
