package com.java.feliflynn.first.provider

import com.java.feliflynn.first.model.NewsApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY="72ec9c8adb024edc8b78c33ea7ed6016"

interface NewsProvider {
    @GET("top-headlines?apiKey=$API_KEY")
    suspend fun topHeadLines(@Query("country")country: String): Response<NewsApiResponse>
}