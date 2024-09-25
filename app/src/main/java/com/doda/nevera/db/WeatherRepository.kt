package com.doda.nevera.db

import javax.inject.Inject

class WeatherRepository @Inject constructor(
    private val weatherDAO: WeatherDAO
){
    suspend fun getAllCities(): List<Cities>{
        return weatherDAO.getAllCities()
    }

    suspend fun insertCity(city: Cities){
        weatherDAO.insertCity(city)
    }

}