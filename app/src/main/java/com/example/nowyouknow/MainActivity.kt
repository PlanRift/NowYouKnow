    package com.example.nowyouknow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nowyouknow.adapter.sectionPagerAdapter
import com.example.nowyouknow.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

    class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpViewPager()
    }
        private fun setUpViewPager() {
            binding.vpNews.adapter = sectionPagerAdapter(this)
            val tablist = arrayOf(
                "CNBC",
                "CNN",
                "Antara"
            )

            val adapter = sectionPagerAdapter(this)
            binding.vpNews.adapter = adapter

            TabLayoutMediator(binding.tabs, binding.vpNews) { tab, position ->
                when (position) {
                    0 -> tab.text = "CNBC"
                    1 -> tab.text = "CNN"
                    2 -> tab.text = "Antara"
                }
            }.attach()

        }
}