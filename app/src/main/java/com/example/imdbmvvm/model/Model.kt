package com.example.imdbmvvm.model

import java.io.Serializable

//data class Movie(val id: Int, val name: String, val date: String, val photo: String) : Serializable
data class Movie(
    val popularity: Double,
    val vote_count: Int,
    val video: Boolean,
    val poster_path: String,
    val id: Int,
    val adult: Boolean,
    val backdrop_path: String,
    val original_language: String,
    val original_title: String,
    val genre_ids: List<Int>,
    val title: String,
    val vote_average: Double,
    val overview: String,
    val release_date: String
) : Serializable