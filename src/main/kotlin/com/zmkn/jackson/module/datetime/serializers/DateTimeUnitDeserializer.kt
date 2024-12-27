package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.JsonNode
import kotlinx.datetime.DateTimeUnit

class DateTimeUnitDeserializer : JsonDeserializer<DateTimeUnit>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimeUnit {
        val node = p.codec.readTree<JsonNode>(p)
        val type = node.get("type")?.asText()
            ?: throw JsonMappingException(p, "Missing required property 'type'")

        return when (type) {
            DateTimeUnit.DayBased::class.simpleName -> {
                val days = node.get("days")?.asInt()
                    ?: throw JsonMappingException(p, "Missing required property 'days'")
                DateTimeUnit.DayBased(days)
            }

            DateTimeUnit.MonthBased::class.simpleName -> {
                val months = node.get("months")?.asInt()
                    ?: throw JsonMappingException(p, "Missing required property 'months'")
                DateTimeUnit.MonthBased(months)
            }

            DateTimeUnit.TimeBased::class.simpleName -> {
                val nanoseconds = node.get("nanoseconds")?.asLong()
                    ?: throw JsonMappingException(p, "Missing required property 'nanoseconds'")
                DateTimeUnit.TimeBased(nanoseconds)
            }

            else -> throw IllegalArgumentException("Unknown type: $type")
        }
    }
}
