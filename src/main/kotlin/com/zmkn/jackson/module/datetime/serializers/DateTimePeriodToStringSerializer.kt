package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import kotlinx.datetime.DateTimePeriod

class DateTimePeriodToStringSerializer : JsonSerializer<DateTimePeriod>() {
    override fun serialize(value: DateTimePeriod, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeString(value.toString())
    }
}
