package com.doda.nevera.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.doda.nevera.data.Forecast

@Entity(tableName = "cities")
data class Cities(
    @PrimaryKey val id: Int,
    val name: String,
    val lat: Double,
    val lon: Double,
    val currentTemp: Double,
    val hourlyForecast: Forecast,
    )
