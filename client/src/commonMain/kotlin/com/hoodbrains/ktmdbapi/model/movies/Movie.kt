package com.hoodbrains.ktmdbapi.model.movies

import com.hoodbrains.ktmdbapi.model.companies.Company
import com.hoodbrains.ktmdbapi.model.configuration.Country
import com.hoodbrains.ktmdbapi.model.configuration.Language
import com.hoodbrains.ktmdbapi.model.genre.Genre

/**
 * https://developers.themoviedb.org/3/movies/get-movie-details
 */
data class Movie(
    val adult: Boolean,
    val backdrop_path: String?,
// val belongs_to_collection : Obect ?
    val budget: Int,
    val genres: List<Genre>,
    val homepage: String?,
    val id: Int,
    val imdb_id: String?,
    val original_language: String,
    val original_title: String,
    val overview: String?,
    val popularity: Float,
    val poster_path: String?,
    val production_companies: List<Company>,
    val production_countries: List<Country>,
    val release_date: String,
    val revenue: Int,
    val runtime: Int?,
    val spoken_languages: List<Language>,
    val status: MovieStatus,
    val tagline: String?,
    val title: String,
    val video: Boolean,
    val vote_average: Float,
    val vote_count: Int
)

enum class MovieStatus {
    Rumored,
    Planned,
    InProduction, // In Production
    PostProduction, // Post Production
    Released,
    Canceled
}