package com.example.tiktokapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.tiktokapp.R
import com.example.tiktokapp.databinding.ActivityMainBinding
import com.example.tiktokapp.presentation.ui.large_video.LargeVideoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    private var largeVideoFragment = LargeVideoFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navItem.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.homeFragment -> {
                    loadFragment(LargeVideoFragment())
                    return@setOnNavigationItemReselectedListener
                }
            }
        }
    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }




}