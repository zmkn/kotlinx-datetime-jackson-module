package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import kotlinx.datetime.DateTimeUnit

class TimeBasedDateTimeUnitSerializer : JsonSerializer<DateTimeUnit.TimeBased>() {
    override fun serialize(value: DateTimeUnit.TimeBased, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeStartObject()
        gen.writeNumberField("nanoseconds", value.nanoseconds)
        gen.writeEndObject()
    }
}
