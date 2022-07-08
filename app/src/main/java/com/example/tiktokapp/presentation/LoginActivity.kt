package com.example.tiktokapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tiktokapp.R
import com.example.tiktokapp.databinding.ActivityLoginBinding
import com.example.tiktokapp.presentation.ui.auth.log_in.LoginEmailFragment
import com.example.tiktokapp.presentation.ui.auth.log_in.LoginPhoneFragment
import com.example.tiktokapp.presentation.ui.auth.log_in.MyViewPagerAdapter
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentAdapter = MyViewPagerAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(LoginPhoneFragment(), "Điện thoại")
        fragmentAdapter.addFragment(LoginEmailFragment(), "Email / TikTok ID")

        binding.viewPager.adapter = fragmentAdapter
        binding.tabLayout.setupWithViewPager(viewPager)
    }
}