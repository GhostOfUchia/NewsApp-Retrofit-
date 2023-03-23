package com.example.learnkotlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.learnkotlin.R
import com.example.learnkotlin.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val bottomNavigationView: BottomNavigationView = binding.bottomNavigation
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController


        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.basicFragment,
                R.id.advanceFragment,
                R.id.androidFragment
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)


    }


}










