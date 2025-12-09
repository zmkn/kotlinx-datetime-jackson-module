package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonMappingException
import kotlinx.datetime.FixedOffsetTimeZone
import kotlinx.datetime.TimeZone

class StringToFixedOffsetTimeZoneDeserializer : JsonDeserializer<FixedOffsetTimeZone>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): FixedOffsetTimeZone {
        val zone = TimeZone.of(p.valueAsString)
        return zone as? FixedOffsetTimeZone ?: throw JsonMappingException(p, "Timezone identifier '$zone' does not correspond to a fixed-offset timezone")
    }
}
