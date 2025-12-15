package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.LocalDate
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class LocalDateToStringSerializer : ValueSerializer<LocalDate>() {
    override fun serialize(value: LocalDate, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeString(value.toString())
    }
}
