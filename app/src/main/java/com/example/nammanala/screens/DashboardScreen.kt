package com.example.nammanala.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DashboardScreen(
    navController: NavController
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        horizontalAlignment =
            Alignment.CenterHorizontally,

        verticalArrangement =
            Arrangement.Center
    ) {

        Text(
            text = "Farmer Dashboard",
            style =
                MaterialTheme.typography.headlineMedium
        )

        Spacer(
            modifier =
                Modifier.height(40.dp)
        )

        Button(
            onClick = {
                navController.navigate("report")
            },

            modifier =
                Modifier.fillMaxWidth()
        ) {

            Text("Report Canal Issue")
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = { },

            modifier =
                Modifier.fillMaxWidth()
        ) {

            Text("Water Status")
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = { },

            modifier =
                Modifier.fillMaxWidth()
        ) {

            Text("Maintenance Tracker")
        }
    }
}