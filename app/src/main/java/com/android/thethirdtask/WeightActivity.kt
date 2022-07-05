package com.android.thethirdtask

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.thethirdtask.databinding.ActivityTipBinding
import com.android.thethirdtask.databinding.ActivityWeightBinding

class WeightActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWeightBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeightBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title = "Weight Converter"
        actionBar.setDisplayHomeAsUpEnabled(true)

        binding.calWeight.setOnClickListener {
            val valueInput : Double = binding.etWeightText.text.toString().toDouble()

            val kgToGram : Double = valueInput * 1000
            val kgToPound : Double = String.format("%.2f", valueInput * 2.2).toDouble()

            val gramToKG : Double = valueInput/1000
            val gramToPound : Double = String.format("%.2f", valueInput * 0.00220462).toDouble()

            val poundToKg : Double = String.format("%.2f",valueInput / 2.2046).toDouble()
            val poundToGram : Double = String.format("%.2f",valueInput / 0.00220462).toDouble()

            when(binding.radioGroupWeight.checkedRadioButtonId){
                1 -> {
                    binding.tvWeightOne.text = "The Weight In Gram is : $kgToGram"
                    binding.tvWeightOne2.text = "The Weight In Pounds is : $kgToPound"
                }
                2 -> {
                    binding.tvWeightOne.text = "The Weight In KiloGram is : $gramToKG"
                    binding.tvWeightOne2.text = "The Weight In Pounds is : $gramToPound"
                }
                3 -> {
                    binding.tvWeightOne.text = "The Weight In Gram is : $poundToGram"
                    binding.tvWeightOne2.text = "The Weight In Kilogram is : $poundToKg"
                }
            }
        }
    }
}