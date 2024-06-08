package com.example.diyfood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.diyfood.Adapter.ViewPagerAdapter
import com.example.diyfood.Survey.SurveyActivity
import com.example.diyfood.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dotsIndicator = binding.dotsIndicator
        val viewPager = binding.welcomepager

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FragmentWelcome1(), "1st")
        adapter.addFragment(FragmentWelcome2(), "2st")
        adapter.addFragment(FragmentWelcome3(), "3st")

        viewPager.adapter = adapter
        dotsIndicator.setViewPager(viewPager)
        binding.buttonSurvey.setOnClickListener {
            val intent = Intent(this, SurveyActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
