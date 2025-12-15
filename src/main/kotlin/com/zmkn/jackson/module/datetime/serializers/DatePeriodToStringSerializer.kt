package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DatePeriod
import tools.jackson.core.JsonGenerator
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer

class DatePeriodToStringSerializer : ValueSerializer<DatePeriod>() {
    override fun serialize(value: DatePeriod, gen: JsonGenerator, ctxt: SerializationContext) {
        gen.writeString(value.toString())
    }
}
