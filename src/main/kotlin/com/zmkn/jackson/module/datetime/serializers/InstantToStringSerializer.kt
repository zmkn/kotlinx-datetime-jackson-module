package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.Instant
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

@Deprecated(
    "Use com.zmkn.jackson.module.time.serializers.InstantToStringSerializer instead",
    ReplaceWith("com.zmkn.jackson.module.time.serializers.InstantToStringSerializer", "com.zmkn.jackson.module.time.serializers.InstantToStringSerializer"),
    level = DeprecationLevel.WARNING
)
class InstantToStringSerializer : ValueSerializer<Instant>() {
    override fun serialize(value: Instant, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeString(value.toString())
    }
}
