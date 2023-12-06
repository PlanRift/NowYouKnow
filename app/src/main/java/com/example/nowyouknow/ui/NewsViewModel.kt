package com.example.nowyouknow.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.nowyouknow.data.model.NewsResponse
import com.example.nowyouknow.data.repository.NewsRepository

class NewsViewModel (private val repository: NewsRepository): ViewModel() {

    val CNBCNewsNews: LiveData<NewsResponse> = repository.CNBCNewsNews
    val CNBCTerbaruNews: LiveData<NewsResponse> = repository.CNBCTerbaruNews
    val CNBCTechNews: LiveData<NewsResponse> = repository.CNBCTechNews

    val CNNTerbaruNews: LiveData<NewsResponse> = repository.CNNTerbaruNews
    val CNNInternasionalNews: LiveData<NewsResponse> = repository.CNNInternasionalNews
    val CNNHiburanNews: LiveData<NewsResponse> = repository.CNNHiburanNews

    val AntaraTerbaruNews: LiveData<NewsResponse> = repository.AntaraTerbaruNews
    val AntaraEkonomiNews: LiveData<NewsResponse> = repository.AntaraEkonomiNews
    val AntaraOtomotifNews: LiveData<NewsResponse> = repository.AntaraOtomotivNews


    fun getCNBCNewsNews() {
        repository.getCNBCNewsNews()
    }
    fun getCNBCTerbaruNews() {
        repository.getCNBCTerbaruNews()
    }

    fun getCNBCTechNews() {
        repository.getCNBCTechNews()
    }

    fun getCNNTerbaruNews() {
        repository.getCNNTerbaruNews()
    }

    fun getCNNInternasionalNews() {
        repository.getCNNInternasionalNews()
    }

    fun getCNNHiburanNews() {
        repository.getCNNHiburanNews()
    }

    fun getAntaraTerbaruNews() {
        repository.getAntaraTerbaruNews()
    }

    fun getAntaraEkonomiNews() {
        repository.getAntaraEkonomiNews()
    }

    fun getAntaraOtomotifNews() {
        repository.getAntaraOtomotifNews()
    }
}