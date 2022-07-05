package com.android.thethirdtask

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.thethirdtask.databinding.ActivityBinaryDecimalBinding
import java.util.*

class BinaryDecimalActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBinaryDecimalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBinaryDecimalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title = "Number Converter"
        actionBar.setDisplayHomeAsUpEnabled(true)

        binding.btnDec.setOnClickListener {

            when(binding.grpDecimal.checkedRadioButtonId){
                1 -> binding.tvDec.text = "Number After Converted : ${binding.decimalBinaryText.text.toString().toInt(2)}"
                2 -> binding.tvDec.text = "Number After Converted : ${Integer.toBinaryString(binding.decimalBinaryText.text.toString().toInt())}"
                //else -> binding.tvDec.text = "Number After Converted : ${binding.decimalBinaryText.text.toString()}"
            }
        }
    }
}