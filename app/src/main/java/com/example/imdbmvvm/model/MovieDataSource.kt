package com.example.imdbmvvm.model

import com.example.imdbmvvm.data.OperationCallback

interface movieDataSource {

    fun retrievemovies(callback: OperationCallback<Movie>)
    fun cancel()
}