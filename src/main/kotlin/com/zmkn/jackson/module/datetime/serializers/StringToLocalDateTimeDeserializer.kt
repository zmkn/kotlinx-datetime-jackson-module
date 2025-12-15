package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.LocalDateTime
import tools.jackson.core.JsonParser
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.ValueDeserializer

class StringToLocalDateTimeDeserializer : ValueDeserializer<LocalDateTime>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): LocalDateTime = LocalDateTime.parse(p.string)
}
