package com.example.nowyouknow.ui.home.antara

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedDispatcher
import com.example.nowyouknow.adapter.NewsAdapter
import com.example.nowyouknow.data.repository.NewsRepository
import com.example.nowyouknow.databinding.FragmentAntaraOtomotifBinding
import com.example.nowyouknow.ui.NewsViewModel
import com.example.nowyouknow.utils.NewsViewModelFactory


class AntaraOtomotifFragment : Fragment() {

    private lateinit var binding: FragmentAntaraOtomotifBinding
    private val commonViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAntaraOtomotifBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        commonViewModel.getAntaraOtomotifNews()
        commonViewModel.AntaraOtomotifNews.observe(viewLifecycleOwner) { newsResponse ->
            val articles = newsResponse.data?.posts
            articles?.let {
                mAdapter.setData(it.filterNotNull())
                binding.rvAntaraOtomotif.apply {
                    adapter = mAdapter
                    layoutManager = LinearLayoutManager(requireContext())
                }
            }
        }
    }
}