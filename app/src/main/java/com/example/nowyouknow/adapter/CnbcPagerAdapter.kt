package com.example.nowyouknow.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.nowyouknow.ui.home.antara.AntaraEkonomiFragment
import com.example.nowyouknow.ui.home.antara.AntaraOtomotifFragment
import com.example.nowyouknow.ui.home.antara.AntaraTerbaruFragment
import com.example.nowyouknow.ui.home.cnbc.CnbcHostFragment
import com.example.nowyouknow.ui.home.cnbc.CnbcNewsFragment
import com.example.nowyouknow.ui.home.cnbc.CnbcTechFragment
import com.example.nowyouknow.ui.home.cnbc.CnbcTerbaruFragment

class CnbcPagerAdapter(fa: CnbcHostFragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CnbcNewsFragment()
            1 -> CnbcTerbaruFragment()
            2 -> CnbcTechFragment()
            else -> CnbcNewsFragment()
        }
    }
}