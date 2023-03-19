package com.example.signin
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.signin.MainActivity
import com.example.signin.R

class ActivityWelcomePage : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)
        val userId: TextView = findViewById(R.id.textView)
        val mainUserId = intent.getStringExtra("username")
        val mainPass = intent.getStringExtra("password")
        val logout: Button = findViewById(R.id.logout)

        userId.text = "Welcome, $mainUserId\nYour pass: $mainPass"

        logout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}