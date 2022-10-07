package com.danieloliveira.smartfarm.feature.home.domain.repository

import com.danieloliveira.smartfarm.feature.home.domain.model.Valve
import com.danieloliveira.smartfarm.feature.home.domain.model.ValveDetails
import kotlinx.coroutines.flow.Flow

interface ValveRepository {

    /**
     * Get a List of [Valve]
     */
    fun getValves(): Flow<List<Valve>>

    /**
     * Get details of the valve
     * @param id - id of [Valve]
     */
    fun getValveDetail(id: Int): ValveDetails
}