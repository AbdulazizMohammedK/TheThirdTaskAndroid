package com.android.thethirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.thethirdtask.databinding.ActivityMainBinding
import com.android.thethirdtask.databinding.ActivityTipBinding

class TipActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTipBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title = "Tip Calculator"
        actionBar.setDisplayHomeAsUpEnabled(true)
        binding.calTip.setOnClickListener {
            val percent = binding.etPercent.text.toString().toDouble()
            val result : Double = binding.editTextBill.text.toString().toDouble() * (percent/100)
            val average : Double =  binding.editTextBill.text.toString().toDouble() / binding.etPeopleNumber.text.toString().toDouble()
            binding.tipCost.text = result.toString()
            binding.tvCostPerPerson.text = average.toString()
        }
    }
}