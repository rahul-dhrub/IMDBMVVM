package com.example.imdbmvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.imdbmvvm.model.movieDataSource

class ViewModelFactory(private val repository:movieDataSource):ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return movieViewModel(repository) as T
    }
}