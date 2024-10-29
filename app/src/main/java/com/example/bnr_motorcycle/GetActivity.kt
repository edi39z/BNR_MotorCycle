package com.example.motorbikeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.bnr_motorcycle.DetailActivity
import com.example.bnr_motorcycle.R

class GetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get)


        val getStartedButton: Button = findViewById(R.id.button_getstarted)


        getStartedButton.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}
