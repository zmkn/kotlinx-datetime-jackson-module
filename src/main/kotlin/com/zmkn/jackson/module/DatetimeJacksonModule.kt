package com.zmkn.jackson.module

import com.fasterxml.jackson.databind.module.SimpleModule
import com.zmkn.jackson.module.serializers.InstantToStringSerializer
import com.zmkn.jackson.module.serializers.StringToInstantDeserializer
import kotlinx.datetime.Instant

class DatetimeJacksonModule : SimpleModule() {
    init {
        addSerializer(Instant::class.java, InstantToStringSerializer())
        addDeserializer(Instant::class.java, StringToInstantDeserializer())
    }
}
