package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import kotlinx.datetime.TimeZone

class TimeZoneToStringSerializer : JsonSerializer<TimeZone>() {
    override fun serialize(value: TimeZone, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeString(value.id)
    }
}
