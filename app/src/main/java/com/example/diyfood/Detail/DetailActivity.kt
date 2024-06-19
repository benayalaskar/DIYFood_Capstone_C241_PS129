package com.example.diyfood.Detail


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.diyfood.R

class DetailActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        imageView = findViewById(R.id.detail_image)
        titleTextView = findViewById(R.id.detail_title)

        val intent = intent
        val imageResource = intent.getIntExtra("imageResource", 0)
        val title = intent.getStringExtra("title")

        imageView.setImageResource(imageResource)
        titleTextView.text = title

        val backButton = findViewById<Button>(R.id.back_button)
        backButton.setOnClickListener {
            finish() // Go back to previous activity
        }
    }
}