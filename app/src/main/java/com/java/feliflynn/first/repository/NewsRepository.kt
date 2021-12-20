package com.java.feliflynn.first.repository

import com.java.feliflynn.first.model.News

interface NewsRepository {
    suspend fun getNews(country:String): List<News>
    fun getNew(title:String):News
}

class NewsRepositoryImp : NewsRepository{
    override fun getNew(title: String): News {
        TODO("Not yet implemented")
    }

    override suspend fun getNews(country: String): List<News> {
        TODO("Not yet implemented")
    }
}