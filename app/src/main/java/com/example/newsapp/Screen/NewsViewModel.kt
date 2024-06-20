package com.example.newsapp.Screen

import com.example.newsapp.network.NewsModel
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.repo.Repo

import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    var res = mutableStateOf<NewsModel?>(null)
    val category = mutableStateOf<String?>(null)
    val error = mutableStateOf<String?>(null)


    init {
        fetchNews()
    }

    fun fetchNews() {
        viewModelScope.launch {
            res.value = getNews(Repo(), category.value)
        }
    }


    suspend fun getNews(repo: Repo, category: String?): NewsModel? {
        return repo.newProvider(category).body()
    }

    fun updateCategory(newCategory: String?) {
        category.value = newCategory
        fetchNews()
    }



}