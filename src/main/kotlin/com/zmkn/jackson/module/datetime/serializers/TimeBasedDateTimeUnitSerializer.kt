package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimeUnit
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class TimeBasedDateTimeUnitSerializer : ValueSerializer<DateTimeUnit.TimeBased>() {
    override fun serialize(value: DateTimeUnit.TimeBased, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeStartObject()
        gen.writeNumberProperty("nanoseconds", value.nanoseconds)
        gen.writeEndObject()
    }
}
