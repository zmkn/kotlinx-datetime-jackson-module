package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import kotlinx.datetime.DateTimePeriod

class StringToDateTimePeriodDeserializer : JsonDeserializer<DateTimePeriod>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DateTimePeriod = DateTimePeriod.parse(p.valueAsString)
}
