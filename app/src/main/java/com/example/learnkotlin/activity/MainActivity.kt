package com.example.learnkotlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.learnkotlin.R
import com.example.learnkotlin.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val bottomNavigationView:BottomNavigationView = binding.bottomNavigation

        val  navController = findNavController(R.id.fragment_container)
        val  appBarConfiguration = AppBarConfiguration(setOf(
            R.id.basicFragment,
            R.id.advanceFragment,
            R.id.androidFragment
        )
        )

        setupActionBarWithNavController(navController,appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)

}

}





/*
 //  window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

   // Data Binding
        //binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        //View Binding
val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.Basic_Fragment,
                R.id.Advance_Fragment,
                R.id.Example_Fragment,
                R.id.Android_Fragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        btmnavView.setupWithNavController(navController)




     fun onSupportNavigateUp(): Boolean{
            return navController.navigateUp() || super.onSupportNavigateUp()


 */





