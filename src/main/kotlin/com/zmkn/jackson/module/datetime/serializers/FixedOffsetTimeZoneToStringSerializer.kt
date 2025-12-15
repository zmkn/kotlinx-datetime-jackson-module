package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.FixedOffsetTimeZone
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class FixedOffsetTimeZoneToStringSerializer : ValueSerializer<FixedOffsetTimeZone>() {
    override fun serialize(value: FixedOffsetTimeZone, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeString(value.id)
    }
}
