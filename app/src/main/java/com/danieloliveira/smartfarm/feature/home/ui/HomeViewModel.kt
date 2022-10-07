package com.danieloliveira.smartfarm.feature.home.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.danieloliveira.smartfarm.feature.home.domain.model.Valve
import com.danieloliveira.smartfarm.feature.home.domain.repository.ValveRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    valveRepository: ValveRepository
) : ViewModel() {


    val uiState: StateFlow<HomeUiState> = valveRepository.getValves().map { valves ->
        HomeUiState.Home(valves)
    }
        .stateIn(
            scope = viewModelScope,
            SharingStarted.WhileSubscribed(5_000),
            initialValue = HomeUiState.Loading
        )

    fun openValve(valveId: Int) {
        TODO("Not yet implemented")
    }
}

sealed interface HomeUiState {

    object Loading : HomeUiState

    data class Home(
        val valves: List<Valve>
    ) : HomeUiState

    object Empty : HomeUiState
}