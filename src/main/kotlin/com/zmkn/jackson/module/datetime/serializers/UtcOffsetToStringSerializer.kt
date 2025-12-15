package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.UtcOffset
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class UtcOffsetToStringSerializer : ValueSerializer<UtcOffset>() {
    override fun serialize(value: UtcOffset, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeString(value.toString())
    }
}
