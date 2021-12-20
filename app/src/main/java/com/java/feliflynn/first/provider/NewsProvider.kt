package com.java.feliflynn.first.provider

import com.java.feliflynn.first.model.NewsApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY=""

interface NewsProvider {
    @GET("top-headlines?apiKey=$API_KEY")
    suspend fun topHeadLines(@Query("country")country: String): Response<NewsApiResponse>
}