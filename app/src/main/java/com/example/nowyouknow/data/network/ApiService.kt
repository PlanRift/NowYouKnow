package com.example.nowyouknow.data.network

import android.util.Size
import com.example.nowyouknow.data.model.NewsResponse
import org.intellij.lang.annotations.Language
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/cnbc/news")
    fun getCNBCNewsNews(
        @Query("q") q: String = "news",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "news"
    ): Call<NewsResponse>

    @GET("/cnbc/terbaru")
    fun getCNBCTerbaruNews(
        @Query("q") q: String = "terbaru",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "terbaru"
    ): Call<NewsResponse>

    @GET("/cnbc/tech")
    fun getCNBCTechNews(
        @Query("q") q: String = "tech",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "tech"
    ): Call<NewsResponse>

    @GET("/cnn/terbaru")
    fun getCNNTerbaruNews(
        @Query("q") q: String = "terbaru",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "terbaru"
    ): Call<NewsResponse>

    @GET("/cnn/internasional")
    fun getCNNInternasionalNews(
        @Query("q") q: String = "internasional",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "internasional"
    ): Call<NewsResponse>

    @GET("/cnn/hiburan")
    fun getCNNHiburanNews(
        @Query("q") q: String = "hiburan",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "hiburan"
    ): Call<NewsResponse>

    @GET("/antara/terbaru")
    fun getAntaraTerbaruNews(
        @Query("q") q: String = "terbaru",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "terbaru"
    ): Call<NewsResponse>

    @GET("/antara/ekonomi")
    fun getAntaraEkonomiNews(
        @Query("q") q: String = "ekonomi",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "ekonomi"
    ): Call<NewsResponse>

    @GET("/antara/otomotif")
    fun getAntaraOtomotifNews(
        @Query("q") q: String = "otomotif",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "otomotif"
    ): Call<NewsResponse>
}