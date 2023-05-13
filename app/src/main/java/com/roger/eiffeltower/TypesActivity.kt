package com.roger.eiffeltower

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.roger.eiffeltower.databinding.ActivityTypesBinding

class TypesActivity : AppCompatActivity() {
    lateinit var binding: ActivityTypesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTypesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.infoButton.setOnClickListener {
            startActivity(Intent(this, InfoActivity::class.java))
        }

        binding.photosButton.setOnClickListener {
            startActivity(Intent(this, PhotosActivity::class.java))
        }



    }
}