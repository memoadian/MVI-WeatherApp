package com.plcoding.weatherapp.data.remote

import com.squareup.moshi.Json

data class WeatherDataDto(
    @field: Json(name = "time")
    val time: List<String>,
    @field: Json(name="relative_humidity_2m")
    val humidities: List<Double>,
    @field: Json(name="pressure_msl")
    val pressures: List<Double>,
    @field: Json(name="weather_code")
    val weatherCodes: List<Int>,
    @field: Json(name="windspeed_10m")
    val windSpeeds: List<Double>,
    @field: Json(name="temperature_2m")
    val temperatures: List<Double>,
)