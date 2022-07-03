package com.example.weather.data.remote

import com.squareup.moshi.Json

data class DTO(
    @field:Json(name = "hourly")
    val data: DataDTO
)