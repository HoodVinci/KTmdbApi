package com.hoodbrains.ktmdbapi.model.configuration

/**
 * https://developers.themoviedb.org/3/configuration/get-api-configuration
 */
data class Configuration(
    val images : ImageConfiguration?,
    val change_keys : List<String>?
)