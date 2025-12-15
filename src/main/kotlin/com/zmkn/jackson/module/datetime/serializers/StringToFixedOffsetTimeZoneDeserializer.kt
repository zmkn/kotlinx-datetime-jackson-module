package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.FixedOffsetTimeZone
import kotlinx.datetime.TimeZone
import tools.jackson.core.JsonParser
import tools.jackson.databind.DatabindException
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.ValueDeserializer

class StringToFixedOffsetTimeZoneDeserializer : ValueDeserializer<FixedOffsetTimeZone>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): FixedOffsetTimeZone {
        val zone = TimeZone.of(p.string)
        return zone as? FixedOffsetTimeZone ?: throw DatabindException.from(p, "Timezone identifier '$zone' does not correspond to a fixed-offset timezone")
    }
}
