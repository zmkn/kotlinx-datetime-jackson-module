package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import kotlinx.datetime.DateTimeUnit

class DayBasedDateTimeUnitSerializer : JsonSerializer<DateTimeUnit.DayBased>() {
    override fun serialize(value: DateTimeUnit.DayBased, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeStartObject()
        gen.writeNumberField("days", value.days)
        gen.writeEndObject()
    }
}
