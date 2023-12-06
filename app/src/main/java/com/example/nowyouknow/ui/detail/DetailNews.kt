package com.example.nowyouknow.ui.detail

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.nowyouknow.R
import com.example.nowyouknow.data.model.Data
import com.example.nowyouknow.data.model.PostsItem
import com.example.nowyouknow.databinding.ActivityDetailNewsBinding
import com.squareup.picasso.Picasso

class DetailNews : AppCompatActivity() {
    private lateinit var binding: ActivityDetailNewsBinding
    companion object {
        const val DATA_NEWS = "data_news"
        const val DATE_NEWS = "date_news"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dataNews = intent.getParcelableExtra<PostsItem>(DATA_NEWS)
        val date = intent.getStringExtra(DATE_NEWS)
        setupMyXML(dataNews, date)
        setupWebView(dataNews)

    }

    private fun setupWebView(dataNews: PostsItem?) {
        val webSetting = binding.wvDetail.settings
        webSetting.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

        dataNews?.link?.let { binding.wvDetail.loadUrl(it) }
    }


    private fun setupMyXML(dataNews: PostsItem?, date: String?) {
        binding.apply {
            detailTitle.text = dataNews?.title
            detailAuthor.text = dataNews?.description
            detailPublishedAt.text = date

            Picasso.get()
                .load(dataNews?.thumbnail)
                .fit()
                .centerInside()
                .into(detailImage)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}