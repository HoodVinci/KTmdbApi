package com.hoodbrains.ktmdbapi.model.companies

import com.hoodbrains.ktmdbapi.model.image.Image

/**
 * https://developers.themoviedb.org/3/companies/get-company-images
 */
data class CompanyLogos(
    val id: Int,
    val logos: List<Image>
)
