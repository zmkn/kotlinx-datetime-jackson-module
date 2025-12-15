package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimeUnit
import tools.jackson.core.JsonParser
import tools.jackson.databind.DatabindException
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.JsonNode
import tools.jackson.databind.ValueDeserializer

class MonthBasedDateTimeUnitDeserializer : ValueDeserializer<DateTimeUnit.MonthBased>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimeUnit.MonthBased {
        val node = p.objectReadContext().readTree<JsonNode>(p)
        val months = node.get("months")?.asInt()
            ?: throw DatabindException.from(p, "Missing required property 'months'")
        return DateTimeUnit.MonthBased(months)
    }
}
