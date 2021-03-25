package com.hoodbrains.ktmdbapi.model.certifications

data class MovieCertifications(
    val US: List<Certification>,
    val CA: List<Certification>,
    val DE: List<Certification>,
    val GB: List<Certification>,
    val AU: List<Certification>,
    val BR: List<Certification>,
    val FR: List<Certification>,
    val NZ: List<Certification>,
    val IN: List<Certification>
)