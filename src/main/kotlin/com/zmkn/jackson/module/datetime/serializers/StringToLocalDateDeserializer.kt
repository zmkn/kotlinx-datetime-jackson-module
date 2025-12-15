package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.LocalDate
import tools.jackson.core.JsonParser
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.ValueDeserializer

class StringToLocalDateDeserializer : ValueDeserializer<LocalDate>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): LocalDate = LocalDate.parse(p.string)
}
