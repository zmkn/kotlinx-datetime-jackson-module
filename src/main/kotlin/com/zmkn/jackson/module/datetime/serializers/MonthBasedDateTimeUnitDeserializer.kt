package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.JsonNode
import kotlinx.datetime.DateTimeUnit

class MonthBasedDateTimeUnitDeserializer : JsonDeserializer<DateTimeUnit.MonthBased>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimeUnit.MonthBased {
        val node = p.codec.readTree<JsonNode>(p)
        val months = node.get("months")?.asInt()
            ?: throw JsonMappingException(p, "Missing required property 'months'")
        return DateTimeUnit.MonthBased(months)
    }
}
