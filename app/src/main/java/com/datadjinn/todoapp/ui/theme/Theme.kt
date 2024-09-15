package com.datadjinn.todoapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color



private val DarkColorScheme = darkColorScheme(
    primary = TealPrimary,
    secondary = TealSecondary,
    tertiary = TealTertiary,
    background = LightGreyBackground, // Light grey background for dark theme
    surface = WhiteSurface, // White surface for contrast
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black, // Text color on background
    onSurface = Color.Black // Text color on surface
)

private val LightColorScheme = lightColorScheme(
    primary = TealPrimary,
    secondary = TealSecondary,
    tertiary = TealTertiary,
    background = LightGreyBackground, // Very light grey background
    surface = WhiteSurface, // White surface for contrast
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black, // Text color on background
    onSurface = Color.Black // Text color on surface
)

@Composable
fun TodoAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme, // Always use light color scheme
        typography = Typography,
        content = content
    )
}
