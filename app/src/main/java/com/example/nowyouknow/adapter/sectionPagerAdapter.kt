package com.example.nowyouknow.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.nowyouknow.ui.home.antara.AntaraHostFragment
import com.example.nowyouknow.ui.home.cnbc.CnbcHostFragment
import com.example.nowyouknow.ui.home.cnn.CnnHostFragment

class sectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CnbcHostFragment()
            1 -> CnnHostFragment()
            2 -> AntaraHostFragment()
            else -> CnbcHostFragment()
        }
    }
}