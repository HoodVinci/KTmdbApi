package com.hoodbrains.ktmdbapi.model.certifications

data class TvCertifications(

    val US: List<Certification>,
    val CA: List<Certification>,
    val AU: List<Certification>,
    val FR: List<Certification>,
    val RU: List<Certification>,
    val DE: List<Certification>,
    val TH: List<Certification>,
    val KR: List<Certification>,
    val GB: List<Certification>,
    val BR: List<Certification>
)
