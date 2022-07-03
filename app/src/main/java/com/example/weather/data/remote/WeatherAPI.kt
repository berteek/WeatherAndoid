package com.example.weather.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

    @GET
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") lon: Double
    )
}