package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import kotlinx.datetime.FixedOffsetTimeZone

class FixedOffsetTimeZoneToStringSerializer : JsonSerializer<FixedOffsetTimeZone>() {
    override fun serialize(value: FixedOffsetTimeZone, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeString(value.id)
    }
}
