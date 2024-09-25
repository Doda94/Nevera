package com.doda.nevera.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WeatherDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCity(city: Cities)

    @Query("SELECT * FROM cities")
    suspend fun getAllCities(): List<Cities>

}