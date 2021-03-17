package com.hoodbrains.ktmdbapi.model.configuration

/**
 * https://developers.themoviedb.org/3/configuration/get-jobs
 */
data class DepartmentJobs(
    val department: String,
    val jobs: List<String>
)