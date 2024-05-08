package com.doda.nevera

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Podatci(
    @SerialName("Vlaga") val vlaga: Double,
    @SerialName("Temp") val temp: Double,
    @SerialName("Tlak") val tlak: Double,
    @SerialName("TlakTend") val tlakTend: Double,
    @SerialName("VjetarSmjer") val vjetarSmjer: String,
    @SerialName("VjetarBrzina") val vjetarBrzina: Double,
    @SerialName("Vrijeme") val vrijeme: String,
    @SerialName("VrijemeZnak") val vrijemeZnak: Int,
)
