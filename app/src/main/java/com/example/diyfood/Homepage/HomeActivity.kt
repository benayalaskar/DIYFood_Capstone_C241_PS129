package com.example.diyfood.Homepage


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.diyfood.MainActivity
import com.example.diyfood.R

class HomeActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeButton: Button = findViewById(R.id.home_button)
        val exitButton: Button = findViewById(R.id.exit_button)

        homeButton.setOnClickListener {
            // Assuming there's a MainActivity to navigate to
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finishAffinity() // Closes all activities and exits the app
        }
    }
}
