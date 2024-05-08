package com.doda.nevera

import java.io.Serial
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HrvatskaResponse(
    @SerialName("DatumTermin") val datum: DatumTermin,
    @SerialName("Grad") val gradovi: List<Grad>,
)
