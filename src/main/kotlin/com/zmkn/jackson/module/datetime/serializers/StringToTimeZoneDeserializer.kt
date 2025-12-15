package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.TimeZone
import tools.jackson.core.JsonParser
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.ValueDeserializer

class StringToTimeZoneDeserializer : ValueDeserializer<TimeZone>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): TimeZone = TimeZone.of(p.string)
}
