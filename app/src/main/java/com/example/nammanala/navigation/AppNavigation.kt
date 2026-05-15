package com.example.nammanala.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.nammanala.screens.LoginScreen
import com.example.nammanala.screens.SplashScreen
import com.example.nammanala.screens.SignupScreen
import com.example.nammanala.screens.DashboardScreen
import com.example.nammanala.screens.ReportScreen

@Composable
fun AppNavigation() {

    val navController =
        rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {

        composable("splash") {
            SplashScreen(navController)
        }

        composable("login") {
            LoginScreen(navController)
        }
        composable("signup") {
            SignupScreen(navController)
        }
        composable("dashboard") {
            DashboardScreen(navController)
        }

        composable("report") {
            ReportScreen(navController)
        }
    }
}