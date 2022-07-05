package com.android.thethirdtask

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.setPadding
import com.android.thethirdtask.databinding.ActivityPercentageBinding
import com.android.thethirdtask.databinding.ActivityTempBinding

class PercentageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPercentageBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPercentageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title = "Percentage Calculator"
        actionBar.setDisplayHomeAsUpEnabled(true)
        binding.calCurrency.setOnClickListener {
            val valueInput : Double = binding.etWeightCurrencyText.text.toString().toDouble()
            val yemniToSr : Double = String.format("%.2f",valueInput / 296).toDouble()
            val ymniToUSD : Double = String.format("%.2f",valueInput / 1122).toDouble()

            val srToYemni : Double = String.format("%.2f", valueInput * 296).toDouble()
            val srToUSD : Double = String.format("%.2f", valueInput / 3.75).toDouble()

            val usdToSr : Double = String.format("%.2f",valueInput * 3.75).toDouble()
            val usdToYr : Double = String.format("%.2f",valueInput * 1122).toDouble()

            when(binding.radioGroupCurrency.checkedRadioButtonId){
                1 -> {
                    binding.tvOneCurrency.text = "The Currency In USD Is : $ymniToUSD"
                    binding.tvOneCurrency2.text = "The Currency In SAR Is : $yemniToSr"
                }
                2 -> {
                    binding.tvOneCurrency.text = "The Currency In USD Is : $srToUSD"
                    binding.tvOneCurrency2.text = "The Currency In YE Is : $srToYemni"
                }
                3 -> {
                    binding.tvOneCurrency.text = "The Currency In SAR Is : $usdToSr"
                    binding.tvOneCurrency2.text = "The Currency In YE Is : $usdToYr"
                }
            }
        }
    }
}