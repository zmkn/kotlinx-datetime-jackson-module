package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimeUnit
import tools.jackson.core.JsonParser
import tools.jackson.databind.DatabindException
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.JsonNode
import tools.jackson.databind.ValueDeserializer

class DayBasedDateTimeUnitDeserializer : ValueDeserializer<DateTimeUnit.DayBased>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimeUnit.DayBased {
        val node = p.objectReadContext().readTree<JsonNode>(p)
        val days = node.get("days")?.asInt()
            ?: throw DatabindException.from(p, "Missing required property 'days'")
        return DateTimeUnit.DayBased(days)
    }
}
