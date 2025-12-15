package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimePeriod
import tools.jackson.core.JsonParser
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.ValueDeserializer

class StringToDateTimePeriodDeserializer : ValueDeserializer<DateTimePeriod>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimePeriod = DateTimePeriod.parse(p.string)
}
