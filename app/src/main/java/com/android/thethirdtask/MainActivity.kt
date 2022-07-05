package com.android.thethirdtask
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.thethirdtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bMI.setOnClickListener {
            val intent = Intent(this,BmiCalculate::class.java)
            startActivity(intent)
        }
        binding.tip.setOnClickListener {
            val intent = Intent(this,TipActivity::class.java)
            startActivity(intent)
        }

        binding.temp.setOnClickListener {
            val intent = Intent(this,TempActivity::class.java)
            startActivity(intent)
        }
        binding.age.setOnClickListener {
            val intent = Intent(this,DateActivity::class.java)
            startActivity(intent)
        }
        binding.percentage.setOnClickListener {
            val intent = Intent(this,PercentageActivity::class.java)
            startActivity(intent)
        }
        binding.deciamlBtn.setOnClickListener {
            val intent = Intent(this,BinaryDecimalActivity::class.java)
            startActivity(intent)
        }
        binding.time.setOnClickListener {
            val intent = Intent(this,TimeActivity::class.java)
            startActivity(intent)
        }
        binding.romanBtnMain.setOnClickListener {
            val intent = Intent(this,NumberToRomanActivity::class.java)
            startActivity(intent)
        }
        binding.btnWeight.setOnClickListener {
            val intent = Intent(this,WeightActivity::class.java)
            startActivity(intent)
        }
    }
}