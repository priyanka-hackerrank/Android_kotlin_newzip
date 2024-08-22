package com.hackerrank.android

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.hackerrank.android.databinding.ActivityMainBinding
import java.lang.Exception
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the view hierarchy and bind the object to it
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Set the view hierarchy as the current layout for the activity
        setContentView(binding.root)

        // Setup and add the HackerRank logo in the toolbar
        setSupportActionBar(binding.toolbar)
        Objects.requireNonNull(supportActionBar)!!.setHomeAsUpIndicator(R.drawable.ic_logo)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // Add click listener to the button
        binding.button.setOnClickListener { view ->
            // On every click, check if the given number is prime or not
            try {
                hideKeyboard(this, view)
                val input = binding.input.text.toString().trim().toInt()
                updateTextView(if (PrimeUtils.isPrime(input)) "It's a Prime" else "It's not a Prime")
            } catch (e: Exception) {
                updateTextView("Invalid input!")
            }
        }
    }

    private fun hideKeyboard(context: Context, view: View) {
        val imm = context.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    /**
     * Method to update the contents of the textview
     */
    private fun updateTextView(result: String?) {
        binding.output.text = result
    }
}