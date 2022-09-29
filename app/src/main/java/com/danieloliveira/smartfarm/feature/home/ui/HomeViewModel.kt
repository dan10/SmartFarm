package com.danieloliveira.smartfarm.feature.home.ui

import androidx.lifecycle.ViewModel
import com.danieloliveira.smartfarm.feature.home.domain.model.Valve
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(

): ViewModel() {
}

sealed interface HomeUiState {

    object Loading : HomeUiState

    data class Home(
        val valves: List<Valve>
    ) : HomeUiState

    object Empty : HomeUiState
}