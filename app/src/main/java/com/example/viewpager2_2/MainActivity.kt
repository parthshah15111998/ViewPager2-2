package com.example.viewpager2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager2_2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager2.adapter=MyAdapter(supportFragmentManager,lifecycle)

        TabLayoutMediator(binding.tabLayout,binding.viewPager2){
            tab,position ->
            when(position){
                0->{
                    tab.text="First"
                }
                1->{
                    tab.text="Second"
                }
                2->{
                    tab.text="Third"
                }
            }
        }.attach()
    }
}