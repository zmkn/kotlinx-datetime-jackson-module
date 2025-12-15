package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.LocalTime
import tools.jackson.core.JsonParser
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.ValueDeserializer

class StringToLocalTimeDeserializer : ValueDeserializer<LocalTime>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): LocalTime = LocalTime.parse(p.string)
}
