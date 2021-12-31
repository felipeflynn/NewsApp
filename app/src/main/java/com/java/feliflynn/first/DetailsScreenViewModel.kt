package com.java.feliflynn.first

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.java.feliflynn.first.model.News
import com.java.feliflynn.first.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

    @HiltViewModel
    class DetailsScreenViewModel @Inject constructor(
        private val repository: NewsRepository
    ) : ViewModel() {

        private val _news = MutableLiveData<News>()

        fun getNewsByTitle(title:String): LiveData<News> {
            viewModelScope.launch(Dispatchers.IO) {
                val news = repository.getNew(title)
                _news.postValue(news)
            }
            return _news
        }
    }

