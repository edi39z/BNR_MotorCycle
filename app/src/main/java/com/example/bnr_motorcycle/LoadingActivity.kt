package com.example.bnr_motorcycle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.motorbikeapp.GetActivity

@SuppressLint("CustomSplashScreen")
class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)
        Handler(Looper.getMainLooper()).postDelayed({
            goToGetInActivity()
        }, 3000L)
    }

    private fun goToGetInActivity() {
        Intent(this, GetActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}
