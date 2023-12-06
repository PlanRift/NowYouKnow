package com.example.nowyouknow.ui.home.cnbc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nowyouknow.R
import com.example.nowyouknow.adapter.NewsAdapter
import com.example.nowyouknow.data.repository.NewsRepository
import com.example.nowyouknow.databinding.FragmentCnbcNewsBinding
import com.example.nowyouknow.databinding.FragmentCnbcTechBinding
import com.example.nowyouknow.ui.NewsViewModel
import com.example.nowyouknow.utils.NewsViewModelFactory

class CnbcTechFragment : Fragment() {

    private lateinit var binding: FragmentCnbcTechBinding
    private val commonViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCnbcTechBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        commonViewModel.getCNBCTechNews()
        commonViewModel.CNBCTechNews.observe(viewLifecycleOwner) { newsResponse ->
            val articles = newsResponse.data?.posts
            articles?.let {
                mAdapter.setData(it.filterNotNull())
                binding.rvCnbcTech.apply {
                    adapter = mAdapter
                    layoutManager = LinearLayoutManager(requireContext())
                }
            }
        }
    }
}