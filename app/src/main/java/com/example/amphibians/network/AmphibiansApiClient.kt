package com.example.amphibians.network

import com.example.amphibians.model.Amphibian
import retrofit2.http.GET

interface AmphibiansApiClient {
    @GET("amphibians")
    suspend fun get(): List<Amphibian>

}