package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import kotlinx.datetime.TimeZone

class StringToTimeZoneDeserializer : JsonDeserializer<TimeZone>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): TimeZone = TimeZone.of(p.valueAsString)
}
