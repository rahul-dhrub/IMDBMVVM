package com.example.imdbmvvm.di

import androidx.lifecycle.ViewModelProvider
import com.example.imdbmvvm.model.movieDataSource
import com.example.imdbmvvm.model.movieRepository
import com.example.imdbmvvm.viewmodel.ViewModelFactory

object Injection {

    private val movieDataSource:movieDataSource = movieRepository()
    private val movieViewModelFactory = ViewModelFactory(movieDataSource)

    fun providerRepository():movieDataSource{
        return movieDataSource
    }

    fun provideViewModelFactory(): ViewModelProvider.Factory{
        return movieViewModelFactory
    }
}