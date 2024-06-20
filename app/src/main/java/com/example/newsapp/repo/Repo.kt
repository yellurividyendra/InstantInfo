package com.example.newsapp.repo

import com.example.newsapp.network.ApiProvider
import com.example.newsapp.network.NewsModel
import retrofit2.Response

class Repo() {
    suspend fun newProvider(category: String?): Response<NewsModel> {
        return ApiProvider.provideApi().getNewsFromServer(category = category)
    }
}