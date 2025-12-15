package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.UtcOffset
import tools.jackson.core.JsonParser
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.ValueDeserializer

class StringToUtcOffsetDeserializer : ValueDeserializer<UtcOffset>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): UtcOffset = UtcOffset.parse(p.string)
}
