package com.hoodbrains.ktmdbapi.model.configuration

/**
 * https://developers.themoviedb.org/3/configuration/get-countries
 */
data class Country(
    val iso_3166_1: String,
    val english_name: String
)