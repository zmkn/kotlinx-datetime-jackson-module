package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.LocalDateTime
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class LocalDateTimeToStringSerializer : ValueSerializer<LocalDateTime>() {
    override fun serialize(value: LocalDateTime, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeString(value.toString())
    }
}
