package com.java.feliflynn.first.di

import com.java.feliflynn.first.provider.NewsProvider
import com.java.feliflynn.first.repository.NewsRepository
import com.java.feliflynn.first.repository.NewsRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun providerNewsRepository(provider: NewsProvider): NewsRepository =
        NewsRepositoryImp(provider)

}