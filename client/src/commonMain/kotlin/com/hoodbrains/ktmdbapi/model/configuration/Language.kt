package com.hoodbrains.ktmdbapi.model.configuration

/**
 * https://developers.themoviedb.org/3/configuration/get-languages
 */
data class Language(
    val iso_639_1: String,
    val english_name: String,
    val name: String,
)