package com.doda.nevera.db

import androidx.room.TypeConverter
import com.doda.nevera.data.Forecast
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class Converters {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    @TypeConverter
    fun fromForecast(forecast: Forecast): String {
        val jsonAdapter = moshi.adapter(Forecast::class.java)
        return jsonAdapter.toJson(forecast)
    }

    @TypeConverter
    fun toForecast(json: String): Forecast? {
        val jsonAdapter = moshi.adapter(Forecast::class.java)
        return jsonAdapter.fromJson(json)
    }

}