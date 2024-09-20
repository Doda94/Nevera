package com.doda.nevera.data

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "Podatci", strict = false)
data class Podatci(
    @field:Element(name = "Vlaga") var vlaga: String = "",
    @field:Element(name = "Temp") var temp: String = "",
    @field:Element(name = "Tlak") var tlak: String = "",
    @field:Element(name = "TlakTend") var tlakTend: String = "",
    @field:Element(name = "VjetarSmjer") var vjetarSmjer: String = "",
    @field:Element(name = "VjetarBrzina") var vjetarBrzina: String = "",
    @field:Element(name = "Vrijeme") var vrijeme: String = "",
    @field:Element(name = "VrijemeZnak") var vrijemeZnak: String = "",
)