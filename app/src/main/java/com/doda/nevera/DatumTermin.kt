package com.doda.nevera

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DatumTermin(
    @SerialName("Datum") val datum: String,
    @SerialName("Termin") val termin: Int,
)