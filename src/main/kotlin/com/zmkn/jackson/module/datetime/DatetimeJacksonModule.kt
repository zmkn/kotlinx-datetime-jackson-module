package com.zmkn.jackson.module.datetime

import com.fasterxml.jackson.databind.module.SimpleModule
import com.zmkn.jackson.module.datetime.serializers.InstantToStringSerializer
import com.zmkn.jackson.module.datetime.serializers.StringToInstantDeserializer
import kotlinx.datetime.Instant

object DatetimeJacksonModule {
    val instant: SimpleModule by lazy {
        SimpleModule().apply {
            addSerializer(Instant::class.java, InstantToStringSerializer())
            addDeserializer(Instant::class.java, StringToInstantDeserializer())
        }
    }

    val all: SimpleModule by lazy {
        SimpleModule().apply {
            addSerializer(Instant::class.java, InstantToStringSerializer())
            addDeserializer(Instant::class.java, StringToInstantDeserializer())
        }
    }
}
