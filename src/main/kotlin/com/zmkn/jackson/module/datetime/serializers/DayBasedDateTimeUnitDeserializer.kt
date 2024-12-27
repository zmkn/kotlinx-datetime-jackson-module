package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.JsonNode
import kotlinx.datetime.DateTimeUnit

class DayBasedDateTimeUnitDeserializer : JsonDeserializer<DateTimeUnit.DayBased>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimeUnit.DayBased {
        val node = p.codec.readTree<JsonNode>(p)
        val days = node.get("days")?.asInt()
            ?: throw JsonMappingException(p, "Missing required property 'days'")
        return DateTimeUnit.DayBased(days)
    }
}
