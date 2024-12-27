package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import kotlinx.datetime.UtcOffset

class StringToUtcOffsetDeserializer : JsonDeserializer<UtcOffset>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): UtcOffset = UtcOffset.parse(p.valueAsString)
}
