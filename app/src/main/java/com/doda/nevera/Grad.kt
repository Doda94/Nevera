package com.doda.nevera

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Grad(
    @SerialName("GradIme") val gradIme: String,
    @SerialName("Lat") val lat: Double,
    @SerialName("Lon") val lon: Double,
    @SerialName("Podatci") val podatci: Podatci,
)
