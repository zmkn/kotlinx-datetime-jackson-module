package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.JsonNode
import kotlinx.datetime.DateTimeUnit

class TimeBasedDateTimeUnitDeserializer : JsonDeserializer<DateTimeUnit.TimeBased>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimeUnit.TimeBased {
        val node = p.codec.readTree<JsonNode>(p)
        val nanoseconds = node.get("nanoseconds")?.asLong()
            ?: throw JsonMappingException(p, "Missing required property 'nanoseconds'")
        return DateTimeUnit.TimeBased(nanoseconds)
    }
}
