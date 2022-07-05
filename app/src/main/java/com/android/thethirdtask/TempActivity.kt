package com.android.thethirdtask

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.thethirdtask.databinding.ActivityTempBinding

class TempActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTempBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTempBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title = "Temperature Converter"
        actionBar.setDisplayHomeAsUpEnabled(true)

//        val valueInput : Double = binding.etFaheText.text.toString().toDouble()
//
//
//        val celsiusToFahr : Double = valueInput * 33.8
//        val celsiusToKelvin : Double = valueInput + 273.15
//
//        val fahrToCelsius : Double = (valueInput - 32) * 0.5556
//        val fahrToKelvin : Double = (((valueInput - 32) * 5) / 9) + 273.15
//
//
//        val kelvinToCelsius : Double = valueInput - 273.15
//        val kelvinToFahr : Double = 1.8 * (valueInput - 273.15) + 15
//        binding.calTemp2.setOnClickListener {
//            val valueInFahr : Double = binding.etFaheText.text.toString().toDouble()
//            val result = (valueInFahr - 32) * (0.5556)
//            val cel = "%.2f".format(result)
//            binding.fahrResult.text = "Temperature In Celsius : ${cel}°C"
//        }
//        binding.calTemp.setOnClickListener {
//            val valueInCel : Double = binding.etCelText.text.toString().toDouble()
//            val result = (valueInCel * 1.8) + 32
//            val far = "%.2f".format(result)
//            binding.celResult.text = "Temperature In Fahrenheit : ${far}°F"
//        }

        binding.calTemp2.setOnClickListener {

            val valueInput : Double = binding.etFaheText.text.toString().toDouble()


            val celsiusToFahr : Double = (valueInput * 1.8) + 32
            val celsiusToKelvin : Double = valueInput + 273.15

            val fahrToCelsius : Double = String.format("%.2f",(valueInput - 32) * 0.5556).toDouble()
            val fahrToKelvin : Double = String.format("%.2f",(((valueInput - 32) * 5) / 9) + 273.15).toDouble()


            val kelvinToCelsius : Double = String.format("%.2f",valueInput - 273.15).toDouble()
            val kelvinToFahr : Double = String.format("%.2f",(valueInput - 273.15) * 1.8 + 32).toDouble()
            when(binding.radioGroupTemp.checkedRadioButtonId){
                1 -> {
                    binding.tvTemp.text = "Temperature In Fahrenheit Is : ${celsiusToFahr}°F"
                    binding.tvTemp2.text = "Temperature In Kelvin Is : ${celsiusToKelvin}K"
                }
                2 -> {
                    binding.tvTemp.text = "Temperature In Celsius Is : ${fahrToCelsius}°C"
                    binding.tvTemp2.text = "Temperature In Kelvin Is : ${fahrToKelvin}K"
                }
                3 -> {
                    binding.tvTemp.text = "Temperature In Fahrenheit Is : ${kelvinToFahr}°F"
                    binding.tvTemp2.text = "Temperature In Celsius Is : ${kelvinToCelsius}°C"
                }
            }
        }
    }

}