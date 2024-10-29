package com.example.bnr_motorcycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bnr_motorcycle.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val motorcycleName = intent.getStringExtra("name") ?: "Nama Tidak Ditemukan"
        val motorcycleImage = intent.getIntExtra("imageResId", R.drawable.motor)

        binding.textMotorcycleName.text = motorcycleName
        binding.imageMotorcycle.setImageResource(motorcycleImage)

        binding.textMotorcycleDescription.text = when (motorcycleName) {
            "Honda NMAX 155" -> getString(R.string.nmax_description)
            "Yamaha XSR 155" -> getString(R.string.xsr_description)
            "Suzuki Thunder 150" -> getString(R.string.thunder_description)
            "Yamaha Vixion 150" -> getString(R.string.vixion_description)
            "Honda Sonic 150" -> getString(R.string.sonic_description)
            "Suzuki Gxr 150" -> getString(R.string.gxr_description)
            else -> "Deskripsi tidak tersedia"
        }


        when (motorcycleName) {
            "Honda NMAX 155" -> setSpecifications("155 cc", "15 hp", "Electric", "Scooter", "Disc", "SOHC")
            "Yamaha XSR 155" -> setSpecifications("155 cc", "19 hp", "Electric", "Sport", "Disc", "DOHC")
            "Suzuki Thunder 150" -> setSpecifications("150 cc", "14 hp", "Electric", "Standard", "Disc", "SOHC")
            "Yamaha Vixion 150" -> setSpecifications("150 cc", "16 hp", "Electric", "Sport", "Disc", "SOHC")
            "Honda Sonic 150" -> setSpecifications("150 cc", "16 hp", "Electric", "Underbone", "Disc", "DOHC")
            "Suzuki Gxr 150" -> setSpecifications("150 cc", "18 hp", "Electric", "Sport", "Disc", "DOHC")
        }
    }

    private fun setSpecifications(capacity: String, power: String, start: String, category: String, brake: String, valve: String) {
        binding.textSpecCapacity.text = capacity
        binding.textSpecPower.text = power
        binding.textSpecStart.text = start
        binding.textSpecCategory.text = category
        binding.textSpecBrake.text = brake
        binding.textSpecValve.text = valve
    }
}
