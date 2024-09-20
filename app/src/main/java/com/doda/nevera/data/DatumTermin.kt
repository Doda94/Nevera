package com.doda.nevera.data

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "DatumTermin", strict = false)
data class DatumTermin(
    @field:Element(name = "Datum") var datum: String = "",
    @field:Element(name = "Termin") var termin: Int = 0,
)