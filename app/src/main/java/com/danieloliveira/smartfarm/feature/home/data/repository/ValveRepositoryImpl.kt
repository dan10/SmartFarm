package com.danieloliveira.smartfarm.feature.home.data.repository

import com.danieloliveira.smartfarm.feature.home.domain.model.Valve
import com.danieloliveira.smartfarm.feature.home.domain.model.ValveDetails
import com.danieloliveira.smartfarm.feature.home.domain.repository.ValveRepository
import kotlinx.coroutines.flow.Flow

class ValveRepositoryImpl: ValveRepository {

    override fun getValves(): Flow<List<Valve>> {
        TODO("Not yet implemented")
    }

    override fun getValveDetail(id: Int): ValveDetails {
        TODO("Not yet implemented")
    }
}