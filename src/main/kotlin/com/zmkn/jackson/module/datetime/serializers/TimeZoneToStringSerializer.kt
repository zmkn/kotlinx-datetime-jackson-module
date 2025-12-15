package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.TimeZone
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class TimeZoneToStringSerializer : ValueSerializer<TimeZone>() {
    override fun serialize(value: TimeZone, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeString(value.id)
    }
}
