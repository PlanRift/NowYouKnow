package com.example.nowyouknow.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.nowyouknow.data.model.NewsResponse
import com.example.nowyouknow.data.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {

    private val _CNBCNewsNews = MutableLiveData<NewsResponse>()
    val CNBCNewsNews:LiveData<NewsResponse> = _CNBCNewsNews

    private val _CNBCTerbaruNews = MutableLiveData<NewsResponse>()
    val CNBCTerbaruNews:LiveData<NewsResponse> = _CNBCTerbaruNews

    private val _CNBCTechNews = MutableLiveData<NewsResponse>()
    val CNBCTechNews:LiveData<NewsResponse> = _CNBCTechNews

    private val _CNNTerbaruNews = MutableLiveData<NewsResponse>()
    val CNNTerbaruNews:LiveData<NewsResponse> = _CNNTerbaruNews

    private val _CNNInternasionalNews = MutableLiveData<NewsResponse>()
    val CNNInternasionalNews:LiveData<NewsResponse> = _CNNInternasionalNews

    private val _CNNHiburanNews = MutableLiveData<NewsResponse>()
    val CNNHiburanNews:LiveData<NewsResponse> = _CNNHiburanNews

    private val _AntaraTerbaruNews = MutableLiveData<NewsResponse>()
    val AntaraTerbaruNews:LiveData<NewsResponse> = _AntaraTerbaruNews

    private val _AntaraEkonomiNews = MutableLiveData<NewsResponse>()
    val AntaraEkonomiNews:LiveData<NewsResponse> = _AntaraEkonomiNews

    private val _AntaraOtomotifNews = MutableLiveData<NewsResponse>()
    val AntaraOtomotivNews:LiveData<NewsResponse> = _AntaraOtomotifNews

    fun getCNBCNewsNews(){
        ApiClient.provideApiService().getCNBCNewsNews()
            .enqueue(object : Callback<NewsResponse>{
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CNBCNewsNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }

            })
    }

    fun getCNBCTerbaruNews(){
        ApiClient.provideApiService().getCNBCTerbaruNews()
            .enqueue(object : Callback<NewsResponse>{
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CNBCTerbaruNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }

            })
    }

    fun getCNBCTechNews(){
        ApiClient.provideApiService().getCNBCTechNews()
            .enqueue(object : Callback<NewsResponse>{
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CNBCTechNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }

            })
    }

    fun getCNNTerbaruNews(){
        ApiClient.provideApiService().getCNNTerbaruNews()
            .enqueue(object : Callback<NewsResponse>{
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CNNTerbaruNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }

            })
    }

    fun getCNNInternasionalNews(){
        ApiClient.provideApiService().getCNNInternasionalNews()
            .enqueue(object : Callback<NewsResponse>{
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CNNInternasionalNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }

            })
    }

    fun getCNNHiburanNews(){
        ApiClient.provideApiService().getCNNHiburanNews()
            .enqueue(object : Callback<NewsResponse>{
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CNNHiburanNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }

            })
    }

    fun getAntaraTerbaruNews(){
        ApiClient.provideApiService().getAntaraTerbaruNews()
            .enqueue(object : Callback<NewsResponse>{
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _AntaraTerbaruNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }

            })
    }

    fun getAntaraEkonomiNews(){
        ApiClient.provideApiService().getAntaraEkonomiNews()
            .enqueue(object : Callback<NewsResponse>{
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _AntaraEkonomiNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }

            })
    }

    fun getAntaraOtomotifNews(){
        ApiClient.provideApiService().getAntaraOtomotifNews()
            .enqueue(object : Callback<NewsResponse>{
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _AntaraOtomotifNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }

            })
    }
}