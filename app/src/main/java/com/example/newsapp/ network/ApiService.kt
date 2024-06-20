package com.example.newsapp.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    //   https://newsapi.org/v2/top-headlines?country=us&sortBy=publishedAt&apiKey=9548fb8206d84445bd15e0a42763cf7d
    @GET("top-headlines")
    suspend fun getNewsFromServer(
        @Query("country") country: String = "in",
        @Query("sortBY") sortBy: String = "publishedAt",
        @Query("category") category: String?,
        @Query("apiKey") apiKey: String = "9548fb8206d84445bd15e0a42763cf7d",
    ): Response<NewsModel>
}