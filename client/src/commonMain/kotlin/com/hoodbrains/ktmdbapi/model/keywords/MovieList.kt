package com.hoodbrains.ktmdbapi.model.keywords

import com.hoodbrains.ktmdbapi.model.movies.Movie

/**
 * https://developers.themoviedb.org/3/keywords/get-movies-by-keyword
 */
data class MovieList(
    val id: Int,
    val page: Int,
    val results : List<Movie>,
    val total_pages : Int,
    val total_results : Int
)