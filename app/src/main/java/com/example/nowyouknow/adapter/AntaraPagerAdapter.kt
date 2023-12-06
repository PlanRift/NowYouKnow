package com.example.nowyouknow.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.nowyouknow.ui.home.antara.AntaraEkonomiFragment
import com.example.nowyouknow.ui.home.antara.AntaraHostFragment
import com.example.nowyouknow.ui.home.antara.AntaraOtomotifFragment
import com.example.nowyouknow.ui.home.antara.AntaraTerbaruFragment

class AntaraPagerAdapter(fa: AntaraHostFragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AntaraTerbaruFragment()
            1 -> AntaraEkonomiFragment()
            2 -> AntaraOtomotifFragment()
            else -> AntaraTerbaruFragment()
        }
    }
}