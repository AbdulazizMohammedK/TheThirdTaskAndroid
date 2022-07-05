package com.android.thethirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.thethirdtask.databinding.ActivityTimeBinding
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class TimeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTimeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title = "Time Converter"
        actionBar.setDisplayHomeAsUpEnabled(true)
        binding.timePicker1.setIs24HourView(true)
        binding.timePicker1.setOnTimeChangedListener { _, i, i2 ->
         binding.tvTime.text = convertTo12Hours("$i:$i2")
        }
    }

    private fun convertTo12Hours(militaryTime: String): String{
        val inputFormat = SimpleDateFormat("hh:mm", Locale.getDefault())
        val outputFormat = SimpleDateFormat("hh:mm aa", Locale.getDefault())
        val date = inputFormat.parse(militaryTime)
        return outputFormat.format(date)
    }
}