package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.Instant
import tools.jackson.core.JsonParser
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.ValueDeserializer

@Deprecated(
    "Use com.zmkn.jackson.module.time.serializers.StringToInstantDeserializer instead",
    ReplaceWith("com.zmkn.jackson.module.time.serializers.StringToInstantDeserializer", "com.zmkn.jackson.module.time.serializers.StringToInstantDeserializer"),
    level = DeprecationLevel.WARNING
)
class StringToInstantDeserializer : ValueDeserializer<Instant>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Instant = Instant.parse(p.string)
}
