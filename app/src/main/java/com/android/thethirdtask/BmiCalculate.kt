package com.android.thethirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.widget.Toast
import androidx.core.view.isEmpty
import com.android.thethirdtask.databinding.ActivityBmiCalculateBinding
import com.android.thethirdtask.databinding.ActivityMainBinding

class BmiCalculate : AppCompatActivity() {
    private lateinit var binding: ActivityBmiCalculateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title = "BMI Calculator"
        actionBar.setDisplayHomeAsUpEnabled(true)
        binding.btnCalBmi.setOnClickListener {
            val heightToMetre : Double = binding.editText.text.toString().toDouble() / 100
            val heightPow = heightToMetre * heightToMetre
            val weight : Double = binding.textWeight.text.toString().toDouble()
            val bmiResult : Double = weight / heightPow
            if (binding.textWeight.text.toString() == "" || binding.editText.text.toString() == ""){
                Toast.makeText(this,"You should Enter data",Toast.LENGTH_SHORT).show()
            }
            else {
                binding.bmiNumber.text = "%.2f".format(bmiResult)
                checkStatusBmi(bmiResult)
            }
        }
    }

    private fun checkStatusBmi(bmi : Double){
        if (bmi < 18.5){
            binding.statusBmi.text = "Your Weight is Under Normal"
        }else if (bmi >= 18.5 && bmi < 24.9){
            binding.statusBmi.text = "Your Weight is Healthy"
        } else if (bmi >= 24.5 && bmi < 30){
            binding.statusBmi.text = "Your Weight is Overweight"
        } else if (bmi >= 30){
            binding.statusBmi.text = "Weight is Suffering from Obesity"
        }
    }
}