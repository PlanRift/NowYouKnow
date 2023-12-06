package com.example.nowyouknow.ui.home.antara

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nowyouknow.adapter.AntaraPagerAdapter
import com.example.nowyouknow.databinding.FragmentAntaraHostBinding
import com.google.android.material.tabs.TabLayoutMediator

class AntaraHostFragment : Fragment() {

    private lateinit var binding: FragmentAntaraHostBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAntaraHostBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {
        binding.vpAntara.adapter = AntaraPagerAdapter(this)
        val tablist = arrayOf(
            "Terbaru",
            "Ekonomi",
            "Otomotif"
        )

        val adapter = AntaraPagerAdapter(this)
        binding.vpAntara.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.vpAntara) { tab, position ->
            when (position) {
                0 -> tab.text = "Terbaru"
                1 -> tab.text = "Ekonomi"
                2 -> tab.text = "otomotif"
            }
        }.attach()
    }
}