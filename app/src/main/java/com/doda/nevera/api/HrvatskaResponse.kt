package com.doda.nevera.api

import com.doda.nevera.data.DatumTermin
import com.doda.nevera.data.Grad
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "Hrvatska", strict = false)
data class HrvatskaResponse(
    @field:Element(
        name = "DatumTermin",
        required = false
    ) var datumTermin: DatumTermin = DatumTermin("", 0),
    @field:ElementList(
        name = "Grad",
        required = false,
        inline = true
    ) var gradovi: List<Grad> = ArrayList(),
)
