package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimeUnit
import tools.jackson.core.JsonParser
import tools.jackson.databind.DatabindException
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.JsonNode
import tools.jackson.databind.ValueDeserializer

class DateTimeUnitDeserializer : ValueDeserializer<DateTimeUnit>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimeUnit {
        val node = p.objectReadContext().readTree<JsonNode>(p)
        val type = node.get("type")?.asString()
            ?: throw DatabindException.from(p, "Missing required property 'type'")

        return when (type) {
            DateTimeUnit.DayBased::class.simpleName -> {
                val days = node.get("days")?.asInt()
                    ?: throw DatabindException.from(p, "Missing required property 'days'")
                DateTimeUnit.DayBased(days)
            }

            DateTimeUnit.MonthBased::class.simpleName -> {
                val months = node.get("months")?.asInt()
                    ?: throw DatabindException.from(p, "Missing required property 'months'")
                DateTimeUnit.MonthBased(months)
            }

            DateTimeUnit.TimeBased::class.simpleName -> {
                val nanoseconds = node.get("nanoseconds")?.asLong()
                    ?: throw DatabindException.from(p, "Missing required property 'nanoseconds'")
                DateTimeUnit.TimeBased(nanoseconds)
            }

            else -> throw IllegalArgumentException("Unknown DateTimeUnit type: $type")
        }
    }
}
