package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimeUnit
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class MonthBasedDateTimeUnitSerializer : ValueSerializer<DateTimeUnit.MonthBased>() {
    override fun serialize(value: DateTimeUnit.MonthBased, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeStartObject()
        gen.writeNumberProperty("months", value.months)
        gen.writeEndObject()
    }
}
