package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimeUnit
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class DateTimeUnitSerializer : ValueSerializer<DateTimeUnit>() {
    override fun serialize(value: DateTimeUnit, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeStartObject()
        gen.writeStringProperty("type", value::class.simpleName ?: "Unknown")
        when (value) {
            is DateTimeUnit.DayBased -> {
                gen.writeNumberProperty("days", value.days)
            }

            is DateTimeUnit.MonthBased -> {
                gen.writeNumberProperty("months", value.months)
            }

            is DateTimeUnit.TimeBased -> {
                gen.writeNumberProperty("nanoseconds", value.nanoseconds)
            }
        }
        gen.writeEndObject()
    }
}
