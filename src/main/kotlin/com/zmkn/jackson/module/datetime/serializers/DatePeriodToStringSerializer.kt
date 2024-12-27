package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import kotlinx.datetime.DatePeriod

class DatePeriodToStringSerializer : JsonSerializer<DatePeriod>() {
    override fun serialize(value: DatePeriod, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeString(value.toString())
    }
}
