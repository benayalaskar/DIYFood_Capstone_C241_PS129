package com.example.diyfood.Survey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class SurveyActivity : AppCompatActivity() {

    private lateinit var categorySpinner: Spinner
    private lateinit var flavorEditText: EditText
    private lateinit var mulaiButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey)

        categorySpinner = findViewById(R.id.category_spinner)
        flavorEditText = findViewById(R.id.flavor_edit_text)
        mulaiButton = findViewById(R.id.mulai_button)

        val categories = arrayOf("Makanan Berat", "Makanan Ringan", "Makanan Manis")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        categorySpinner.adapter = adapter

        categorySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedCategory = categories[position]
                Toast.makeText(this@SurveyActivity, "Selected category: $selectedCategory", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        mulaiButton.setOnClickListener {
            val flavor = flavorEditText.text.toString()
            if (flavor.isEmpty()) {
                Toast.makeText(this, "Please enter a flavor", Toast.LENGTH_SHORT).show()
            } else {
                // Do something with the flavor and category
                Toast.makeText(this, "Flavor: $flavor, Category: ${categorySpinner.selectedItem}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}