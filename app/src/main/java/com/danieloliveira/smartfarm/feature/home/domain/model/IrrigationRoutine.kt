package com.danieloliveira.smartfarm.feature.home.domain.model

import java.time.LocalDateTime

data class IrrigationRoutine(
    val description: String,
    val hour: LocalDateTime
)