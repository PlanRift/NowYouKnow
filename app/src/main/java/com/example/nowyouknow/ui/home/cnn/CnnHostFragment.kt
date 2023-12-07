package com.example.nowyouknow.ui.home.cnn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nowyouknow.adapter.CnnPagerAdapter
import com.example.nowyouknow.databinding.FragmentCnnHostBinding
import com.google.android.material.tabs.TabLayoutMediator

class CnnHostFragment : Fragment() {
    private lateinit var binding: FragmentCnnHostBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCnnHostBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {

        val adapter = CnnPagerAdapter(this)
        binding.vpCnn.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.vpCnn) { tab, position ->
            when (position) {
                0 -> tab.text = "Terbaru"
                1 -> tab.text = "Internasional"
                2 -> tab.text = "Hiburan"
            }
        }.attach()
    }
}