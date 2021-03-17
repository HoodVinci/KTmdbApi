package com.hoodbrains.ktmdbapi

import com.hoodbrains.ktmdbapi.model.configuration.*
import com.hoodbrains.ktmdbapi.model.genre.Genre

interface TmdbApi {

    val configuration : ConfigurationApi
    val genre : GenreApi

    interface ConfigurationApi {
        suspend fun fetchMain(): Configuration
        suspend fun fetchCountries(): List<Country>
        suspend fun fetchJobs(): List<DepartmentJobs>
        suspend fun fetchLanguages(): List<Language>
        suspend fun fetchPrimaryTranslations(): List<String>
        suspend fun fetchTimezones(): List<Timezone>
    }

    interface GenreApi {
        suspend fun movieGenreList(): List<Genre>
        suspend fun tvGenreList(): List<Genre>
    }
}