package com.danieloliveira.smartfarm.feature.home.domain.model

import java.time.LocalDateTime

data class ValveDetails(
    /**
     * Id of the [Valve]
     */
    val id: Int,
    /**
     * To know if the valve is irrigating the plant
     */
    val isOpen: Boolean,
    /**
     * To know if the valve is associated with a plant
     */
    val isAssociated: Boolean,
    /**
     * Name of the plant is Associated
     */
    val plantName: String,
    /**
     * Url of Picture of the plant
     */
    val plantPictureUrl: String,
    /**
     * Info about last time the plant was irrigated
     */
    val lastTimeIrrigated: LocalDateTime,
    /**
     *
     */
    val irrigationRoutines: List<IrrigationRoutine>
)