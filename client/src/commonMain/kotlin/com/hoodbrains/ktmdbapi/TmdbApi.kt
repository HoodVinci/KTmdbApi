package com.hoodbrains.ktmdbapi

import com.hoodbrains.ktmdbapi.model.companies.AlternativeName
import com.hoodbrains.ktmdbapi.model.companies.Company
import com.hoodbrains.ktmdbapi.model.companies.CompanyLogos
import com.hoodbrains.ktmdbapi.model.configuration.*
import com.hoodbrains.ktmdbapi.model.genre.Genre

interface TmdbApi {

    val configuration : ConfigurationApi
    val genre : GenreApi
    val companies : CompanyApi

    interface ConfigurationApi {
        suspend fun fetchMain(): Configuration
        suspend fun fetchCountries(): List<Country>
        suspend fun fetchJobs(): List<DepartmentJobs>
        suspend fun fetchLanguages(): List<Language>
        suspend fun fetchPrimaryTranslations(): List<String>
        suspend fun fetchTimezones(): List<Timezone>
    }

    interface GenreApi {
        suspend fun fetchMovieGenres(): List<Genre>
        suspend fun fetchTvGenres(): List<Genre>
    }

    interface CompanyApi {
        suspend fun fetchCompany(id : Int): Company
        suspend fun fetchAlternativeNames(): List<AlternativeName>
        suspend fun fetchLogos(id: Int): CompanyLogos
    }
}