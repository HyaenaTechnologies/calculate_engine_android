package dev.calculate_engine.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import dev.calculate_engine.R

// In Development Route: Stateless
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun InDevelopment(
    navigationHost: NavHostController
) {
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        content = { innerPadding ->
            Column(
                modifier = Modifier.consumeWindowInsets(innerPadding)
            ) {
                Image(
                    contentDescription = "In Development",
                    painter = painterResource(id = R.drawable.in_development)
                )
            }
        },
        topBar = {
            NavigationTopBar(
                appBarScroll = topBarScroll,
                hostController = navigationHost,
                titleText = "In Development"
            )
        },
    )
}