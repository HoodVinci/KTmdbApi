package com.hoodbrains.ktmdbapi.model.credits

import com.hoodbrains.ktmdbapi.model.tv.Episode
import com.hoodbrains.ktmdbapi.model.tv.Season

/**
 * https://developers.themoviedb.org/3/credits/get-credit-details
 */
data class MediaCredit(
    val id: Int,
    val name: String,
    val original_name: String,
    val character: String,
    val episodes: List<Episode>,
    val seasons: List<Season>
)