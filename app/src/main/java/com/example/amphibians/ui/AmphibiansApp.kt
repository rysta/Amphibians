package com.example.amphibians.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AmphibiansApp(){
    var scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier =Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            //TODO: Создать AmphibiansTopAppBar
         }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize().padding(it)
        ) {
            //TODO: добавить viewModel и HomeScreen.
        }
    }
}

