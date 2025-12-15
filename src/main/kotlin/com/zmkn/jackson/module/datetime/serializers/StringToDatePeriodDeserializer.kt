package com.zmkn.jackson.module.datetime.serializers

import kotlinx.datetime.DatePeriod
import kotlinx.datetime.DateTimePeriod
import tools.jackson.core.JsonParser
import tools.jackson.databind.DatabindException
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.ValueDeserializer

class StringToDatePeriodDeserializer : ValueDeserializer<DatePeriod>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DatePeriod {
        val period = DateTimePeriod.parse(p.string)
        return period as? DatePeriod ?: throw DatabindException.from(p, "$period is not a date-based period")
    }
}
