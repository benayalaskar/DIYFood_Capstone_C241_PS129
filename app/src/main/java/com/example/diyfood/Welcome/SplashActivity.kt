package com.example.diyfood.Welcome

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.diyfood.MainActivity
import com.example.diyfood.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            goToMainAcvitiy()
        }, 3000)
    }
    private fun goToMainAcvitiy() {
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}