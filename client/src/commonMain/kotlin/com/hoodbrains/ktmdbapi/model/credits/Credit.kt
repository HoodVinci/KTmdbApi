package com.hoodbrains.ktmdbapi.model.credits

import com.hoodbrains.ktmdbapi.model.people.Person

/**
 * https://developers.themoviedb.org/3/credits/get-credit-details
 */
data class Credit(
    val credit_type: String,
    val department: String,
    val job: String,
    val media: MediaCredit,
    val media_type: String,
    val id: String,
    val person: Person
)