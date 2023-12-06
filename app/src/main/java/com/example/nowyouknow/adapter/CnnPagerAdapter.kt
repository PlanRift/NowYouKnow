package com.example.nowyouknow.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.nowyouknow.ui.home.cnn.CnnHiburanFragment
import com.example.nowyouknow.ui.home.cnn.CnnHostFragment
import com.example.nowyouknow.ui.home.cnn.CnnInternasionalFragment
import com.example.nowyouknow.ui.home.cnn.CnnTerbaruFragment

class CnnPagerAdapter(fa: CnnHostFragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CnnTerbaruFragment()
            1 -> CnnInternasionalFragment()
            2 -> CnnHiburanFragment()
            else -> CnnTerbaruFragment()
        }
    }
}