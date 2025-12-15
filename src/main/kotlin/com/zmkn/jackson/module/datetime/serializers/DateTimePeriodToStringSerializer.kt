package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DateTimePeriod
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class DateTimePeriodToStringSerializer : ValueSerializer<DateTimePeriod>() {
    override fun serialize(value: DateTimePeriod, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeString(value.toString())
    }
}
