package com.surajkumar854.heros

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HeroText(title: String) {
    Text(text = title, modifier = Modifier.fillMaxSize())
}