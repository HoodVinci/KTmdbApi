package com.hoodbrains.ktmdbapi.model.configuration

data class Timezone(
    val iso_3166_1: String,
    val zones : List<String>
)
