package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.LocalTime
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class LocalTimeToStringSerializer : ValueSerializer<LocalTime>() {
    override fun serialize(value: LocalTime, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeString(value.toString())
    }
}
