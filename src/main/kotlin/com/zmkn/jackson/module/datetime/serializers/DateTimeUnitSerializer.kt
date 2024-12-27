package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import kotlinx.datetime.DateTimeUnit

class DateTimeUnitSerializer : JsonSerializer<DateTimeUnit>() {
    override fun serialize(value: DateTimeUnit, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeStartObject()
        gen.writeStringField("type", value::class.simpleName ?: "Unknown")
        when (value) {
            is DateTimeUnit.DayBased -> {
                gen.writeNumberField("days", value.days)
            }

            is DateTimeUnit.MonthBased -> {
                gen.writeNumberField("months", value.months)
            }

            is DateTimeUnit.TimeBased -> {
                gen.writeNumberField("nanoseconds", value.nanoseconds)
            }
        }
        gen.writeEndObject()
    }
}
