package com.hoodbrains.ktmdbapi.model.companies

data class Company(
    val description :String,
    val headquarters :String,
    val homepage :String,
    val id :Int,
    val logo_path :String,
    val name :String,
    val origin_country :String,
    val parent_company : Company?
)
