package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import kotlinx.datetime.DateTimeUnit

class MonthBasedDateTimeUnitSerializer : JsonSerializer<DateTimeUnit.MonthBased>() {
    override fun serialize(value: DateTimeUnit.MonthBased, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeStartObject()
        gen.writeNumberField("months", value.months)
        gen.writeEndObject()
    }
}
