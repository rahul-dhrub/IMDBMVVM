package com.example.imdbmvvm.data

import com.example.imdbmvvm.model.Movie

class MovieResponse(){
    var page: Int = 0
    var total_results: Int = 0
    var total_pages: Int = 0
    lateinit var results: List<Movie>
    fun isSuccess(): Boolean = (page != 0)
}