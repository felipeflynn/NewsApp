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
class ListScreenViewModel @Inject constructor(
    private val repository: NewsRepository
): ViewModel() {

    private val _news = MutableLiveData<List<News>>()

    fun getNews(): LiveData<List<News>>{
        viewModelScope.launch(Dispatchers.IO) {
            //Aca ya puedo llamar corrutinas
            val news = repository.getNews("AR")
            _news.postValue(news)
        }
        return _news
    }

}