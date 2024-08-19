package dev.calculate_engine.widgets

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.calculate_engine.R
import dev.calculate_engine.theme.bodyFontFamily

// Home Route Navigation Bar Widget: Stateless
@Composable
fun HomeNavigationBar() {
    NavigationBar {
        NavigationBarItem(
            alwaysShowLabel = true,
            enabled = true,
            icon = {
                R.raw.calculator
            },
            label = {
                Text(
                    "Basic",
                    fontFamily = bodyFontFamily,
                    maxLines = 1,
                    softWrap = true,
                )
            },
            onClick = {},
            selected = false,
        )
        NavigationBarItem(
            alwaysShowLabel = true,
            enabled = true,
            icon = {
                R.raw.book
            },
            label = {
                Text(
                    "OpenStax",
                    fontFamily = bodyFontFamily,
                    maxLines = 1,
                    softWrap = true,
                )
            },
            onClick = {},
            selected = false,
        )
    }
}