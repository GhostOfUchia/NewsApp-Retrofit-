package com.example.learnkotlin.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.learnkotlin.R

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        supportActionBar?.hide()
        val decorView = window.decorView
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000
    }
}

/*
  <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/animation"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:lottie_autoPlay="true"
        app:lottie_loop="true"
        app:lottie_rawRes="@raw/kotlinsplashscreen" />
 */