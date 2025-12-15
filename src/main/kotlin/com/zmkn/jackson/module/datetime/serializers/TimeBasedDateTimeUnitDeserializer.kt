package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimeUnit
import tools.jackson.core.JsonParser
import tools.jackson.databind.DatabindException
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.JsonNode
import tools.jackson.databind.ValueDeserializer

class TimeBasedDateTimeUnitDeserializer : ValueDeserializer<DateTimeUnit.TimeBased>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimeUnit.TimeBased {
        val node = p.objectReadContext().readTree<JsonNode>(p)
        val nanoseconds = node.get("nanoseconds")?.asLong()
            ?: throw DatabindException.from(p, "Missing required property 'nanoseconds'")
        return DateTimeUnit.TimeBased(nanoseconds)
    }
}
