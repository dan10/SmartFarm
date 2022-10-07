package com.danieloliveira.smartfarm.feature.home.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.danieloliveira.smartfarm.feature.home.domain.model.Valve

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun HomeRoute(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    HomeScreen(uiState, onOpenValve = {
        viewModel.openValve(it)
    })
}

@Composable
fun HomeScreen(
    uiState: HomeUiState,
    onOpenValve: (Int) -> Unit
) {
    when (uiState) {
        HomeUiState.Empty -> Text(text = "Currently No Data")
        is HomeUiState.Home -> HomeValves(uiState.valves, onOpenValve)
        HomeUiState.Loading -> TODO()
    }
}

@Composable
fun HomeValves(valves: List<Valve>, onOpenValve: (Int) -> Unit) {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {


        items(valves, key = { it.id }) { valve ->
            Column {
                Text(text = valve.plantName)
                Switch(checked = valve.isOpen, onCheckedChange = { onOpenValve(valve.id) })
            }
        }
    }
}

