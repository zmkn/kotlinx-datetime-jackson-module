package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimeUnit
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class DayBasedDateTimeUnitSerializer : ValueSerializer<DateTimeUnit.DayBased>() {
    override fun serialize(value: DateTimeUnit.DayBased, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeStartObject()
        gen.writeNumberProperty("days", value.days)
        gen.writeEndObject()
    }
}
