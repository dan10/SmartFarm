package com.danieloliveira.smartfarm.feature.home.domain.model

data class Valve(
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
     *
     */
    val plantName: String
)
