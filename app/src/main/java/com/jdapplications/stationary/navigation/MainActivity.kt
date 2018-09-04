package com.jdapplications.stationary.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigation()
    }

    override fun onSupportNavigateUp() =
            Navigation.findNavController(findViewById(R.id.my_nav_host_fragment)).navigateUp()

    private fun setupNavigation() {
        val navController = Navigation.findNavController(findViewById(R.id.my_nav_host_fragment))
        NavigationUI.setupActionBarWithNavController(this@MainActivity, navController)
    }
}
