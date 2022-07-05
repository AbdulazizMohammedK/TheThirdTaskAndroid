package com.android.thethirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import com.android.thethirdtask.databinding.ActivityDateBinding
import com.android.thethirdtask.databinding.ActivityMainBinding
import kotlin.math.floor
import kotlin.math.round

class DateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var actionBar = supportActionBar
        actionBar!!.title = "Date Converter"
        actionBar.setDisplayHomeAsUpEnabled(true)



        binding.btnConvertDate.setOnClickListener {
            when (binding.grpDate.checkedRadioButtonId) {
                1 -> {
                    val hijri = binding.etgergorianDateText.text.toString().toInt() - 622
                    val hgri = hijri * 1.03
                    binding.tvDate.text = floor(hgri).toInt().toString()
                }
                2 -> {
                    val gergorian = binding.etgergorianDateText.text.toString().toInt() * 0.97 + 622
                    binding.tvDate.text = floor(gergorian).toInt().toString()
                }
            }
        }
    }

}