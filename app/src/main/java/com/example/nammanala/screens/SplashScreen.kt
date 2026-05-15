package com.example.nammanala.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController:
    androidx.navigation.NavController
){

    val scale = remember {
        Animatable(0.7f)
    }

    LaunchedEffect(true) {

        scale.animateTo(
            targetValue = 1f,
            animationSpec = tween(1200)
        )

        delay(1500)
        navController.navigate("login")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xFF2E7D32),
                        Color(0xFF81C784)
                    )
                )
            )
            .scale(scale.value),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Namma Nala",
            fontSize = 38.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(
            text = "Smart Canal Monitoring",
            fontSize = 18.sp,
            color = Color.White
        )
    }
}