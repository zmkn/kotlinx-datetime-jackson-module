package com.zmkn.jackson.module.datetime

import com.fasterxml.jackson.databind.module.SimpleModule
import com.zmkn.jackson.module.datetime.serializers.*
import kotlinx.datetime.*

object DatetimeJacksonModule {
    val datePeriodSerializers = fun SimpleModule.() {
        addSerializer(DatePeriod::class.java, DatePeriodToStringSerializer())
        addDeserializer(DatePeriod::class.java, StringToDatePeriodDeserializer())
    }

    val dateTimePeriodSerializers = fun SimpleModule.() {
        addSerializer(DateTimePeriod::class.java, DateTimePeriodToStringSerializer())
        addDeserializer(DateTimePeriod::class.java, StringToDateTimePeriodDeserializer())
    }

    val fixedOffsetTimeZoneSerializers = fun SimpleModule.() {
        addSerializer(FixedOffsetTimeZone::class.java, FixedOffsetTimeZoneToStringSerializer())
        addDeserializer(FixedOffsetTimeZone::class.java, StringToFixedOffsetTimeZoneDeserializer())
    }

    val timeZoneSerializers = fun SimpleModule.() {
        addSerializer(TimeZone::class.java, TimeZoneToStringSerializer())
        addDeserializer(TimeZone::class.java, StringToTimeZoneDeserializer())
    }

    val utcOffsetSerializers = fun SimpleModule.() {
        addSerializer(UtcOffset::class.java, UtcOffsetToStringSerializer())
        addDeserializer(UtcOffset::class.java, StringToUtcOffsetDeserializer())
    }

    val instantSerializers = fun SimpleModule.() {
        addSerializer(Instant::class.java, InstantToStringSerializer())
        addDeserializer(Instant::class.java, StringToInstantDeserializer())
    }

    val localDateSerializers = fun SimpleModule.() {
        addSerializer(LocalDate::class.java, LocalDateToStringSerializer())
        addDeserializer(LocalDate::class.java, StringToLocalDateDeserializer())
    }

    val localTimeSerializers = fun SimpleModule.() {
        addSerializer(LocalTime::class.java, LocalTimeToStringSerializer())
        addDeserializer(LocalTime::class.java, StringToLocalTimeDeserializer())
    }

    val localDateTimeSerializers = fun SimpleModule.() {
        addSerializer(LocalDateTime::class.java, LocalDateTimeToStringSerializer())
        addDeserializer(LocalDateTime::class.java, StringToLocalDateTimeDeserializer())
    }

    val dateTimeUnitSerializers = fun SimpleModule.() {
        addSerializer(DateTimeUnit::class.java, DateTimeUnitSerializer())
        addDeserializer(DateTimeUnit::class.java, DateTimeUnitDeserializer())
        addSerializer(DateTimeUnit.TimeBased::class.java, TimeBasedDateTimeUnitSerializer())
        addDeserializer(DateTimeUnit.TimeBased::class.java, TimeBasedDateTimeUnitDeserializer())
        addSerializer(DateTimeUnit.DayBased::class.java, DayBasedDateTimeUnitSerializer())
        addDeserializer(DateTimeUnit.DayBased::class.java, DayBasedDateTimeUnitDeserializer())
        addSerializer(DateTimeUnit.MonthBased::class.java, MonthBasedDateTimeUnitSerializer())
        addDeserializer(DateTimeUnit.MonthBased::class.java, MonthBasedDateTimeUnitDeserializer())
    }

    val all: SimpleModule by lazy {
        generateModule(
            datePeriodSerializers,
            dateTimePeriodSerializers,
            fixedOffsetTimeZoneSerializers,
            timeZoneSerializers,
            utcOffsetSerializers,
            instantSerializers,
            localDateSerializers,
            localTimeSerializers,
            localDateTimeSerializers,
            dateTimeUnitSerializers,
        )
    }

    fun generateModule(vararg serializers: SimpleModule.() -> Unit): SimpleModule {
        return SimpleModule().apply {
            serializers.forEach {
                it()
            }
        }
    }
}
