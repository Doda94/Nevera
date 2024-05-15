package com.doda.nevera

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "Grad", strict = false)
data class Grad(
    @field:Element(name = "GradIme") var gradIme: String = "",
    @field:Element(name = "Lat") var lat: Double = 0.0,
    @field:Element(name = "Lon") var lon: Double = 0.0,
    @field:Element(name = "Podatci") var podatci: Podatci = Podatci(),
)
