package com.hoodbrains.ktmdbapi.model.image

/**
 * https://developers.themoviedb.org/3/companies/get-company-images
 */
data class Image(
    val aspect_ratio: Float,
    val file_path: String,
    val height: Int,
    val id: String,
    val file_type: String,
    val vote_average: Int,
    val vote_count: Int,
    val width: Int
)
