package com.zmkn.jackson.module.datetime.serializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonMappingException
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.DateTimePeriod

class StringToDatePeriodDeserializer : JsonDeserializer<DatePeriod>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DatePeriod {
        return when (val period = DateTimePeriod.parse(p.valueAsString)) {
            is DatePeriod -> period
            else -> throw JsonMappingException(p, "$period is not a date-based period")
        }
    }
}
