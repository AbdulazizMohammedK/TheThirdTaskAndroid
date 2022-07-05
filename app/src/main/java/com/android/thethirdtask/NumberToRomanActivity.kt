package com.android.thethirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import com.android.thethirdtask.databinding.ActivityNumberToRomanBinding

class NumberToRomanActivity : AppCompatActivity() {
    private lateinit var binding : ActivityNumberToRomanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNumberToRomanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title = "Number To Roman Converter"
        actionBar.setDisplayHomeAsUpEnabled(true)
        binding.btnCalRoman.setOnClickListener {
            val result = numberToRoman(binding.etRoman.text.toString().toInt()).toString()
            binding.romanNumber.text = result
        }
    }

    private fun numberToRoman(num: Int): Any {

        val m = arrayOf("", "M", "MM", "MMM")
        val c = arrayOf(
            "", "C", "CC", "CCC", "CD", "D",
            "DC", "DCC", "DCCC", "CM"
        )
        val x = arrayOf(
            "", "X", "XX", "XXX", "XL", "L",
            "LX", "LXX", "LXXX", "XC"
        )
        val i = arrayOf(
            "", "I", "II", "III", "IV", "V",
            "VI", "VII", "VIII", "IX"
        )
        val thousands = m[num / 1000]
        val hundreds = c[num % 1000 / 100]
        val tens = x[num % 100 / 10]
        val ones = i[num % 10]

        return thousands + hundreds + tens + ones
    }
}