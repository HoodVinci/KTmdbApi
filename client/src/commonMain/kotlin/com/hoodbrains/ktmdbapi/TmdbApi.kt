package com.hoodbrains.ktmdbapi

import com.hoodbrains.ktmdbapi.model.configuration.*

interface TmdbApi {

    val configuration : ConfigurationApi

    interface ConfigurationApi {
        suspend fun fetchMain(): Configuration
        suspend fun fetchCountries(): List<Country>
        suspend fun fetchJobs(): List<DepartmentJobs>
        suspend fun fetchLanguages(): List<Language>
        suspend fun fetchPrimaryTranslations(): List<String>
        suspend fun fetchTimezones(): List<Timezone>
    }
}