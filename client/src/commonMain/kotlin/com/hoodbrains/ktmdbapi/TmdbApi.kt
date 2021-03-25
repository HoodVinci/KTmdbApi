package com.hoodbrains.ktmdbapi

import com.hoodbrains.ktmdbapi.model.certifications.MovieCertifications
import com.hoodbrains.ktmdbapi.model.certifications.TvCertifications
import com.hoodbrains.ktmdbapi.model.companies.AlternativeName
import com.hoodbrains.ktmdbapi.model.companies.Company
import com.hoodbrains.ktmdbapi.model.companies.CompanyLogos
import com.hoodbrains.ktmdbapi.model.configuration.*
import com.hoodbrains.ktmdbapi.model.credits.Credit
import com.hoodbrains.ktmdbapi.model.genre.Genre
import com.hoodbrains.ktmdbapi.model.keywords.Keyword
import com.hoodbrains.ktmdbapi.model.keywords.MovieList
import com.hoodbrains.ktmdbapi.model.movies.Movie

interface TmdbApi {

    val configuration: ConfigurationApi
    val genre: GenreApi
    val companies: CompanyApi
    val certifications: CertificationsApi
    val creditsApi: CreditsApi

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
        suspend fun fetchCompany(companyId: Int): Company
        suspend fun fetchAlternativeNames(companyId: Int): List<AlternativeName>
        suspend fun fetchLogos(companyId: Int): CompanyLogos
    }

    interface CertificationsApi {
        suspend fun fetchTvCertifications(): TvCertifications
        suspend fun fetchMovieCertifications(): MovieCertifications
    }

    interface CreditsApi {
        suspend fun fetchCredit(creditId : Int): Credit
    }

    interface KeywordsApi {
        suspend fun fetchKeyword(keywordId : Int): Keyword
        suspend fun fetchKeywordMovies(keywordId : Int): MovieList
    }
}