package com.example.nammanala.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

@Composable
fun ReportScreen(
    navController: NavController
) {

    var issue by remember {
        mutableStateOf("")
    }

    var description by remember {
        mutableStateOf("")
    }

    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .padding(20.dp)
    ) {

        IconButton(
            onClick = {
                navController.popBackStack()
            }
        ) {

            Icon(
                imageVector =
                    Icons.Default.ArrowBack,

                contentDescription =
                    "Back"
            )
        }

        Text(
            "Report Canal Issue",
            style =
                MaterialTheme.typography.headlineMedium
        )

        Spacer(
            Modifier.height(20.dp)
        )

        OutlinedTextField(
            value = issue,

            onValueChange = {
                issue = it
            },

            label = {
                Text("Issue Type")
            },

            modifier =
                Modifier.fillMaxWidth()
        )

        Spacer(
            Modifier.height(20.dp)
        )

        OutlinedTextField(
            value = description,

            onValueChange = {
                description = it
            },

            label = {
                Text("Description")
            },

            modifier =
                Modifier.fillMaxWidth()
        )

        Spacer(
            Modifier.height(20.dp)
        )

        Button(
            onClick = { },

            modifier =
                Modifier.fillMaxWidth()
        ) {

            Text("Upload Image")
        }

        Spacer(
            Modifier.height(20.dp)
        )

        Button(
            onClick = { },

            modifier =
                Modifier.fillMaxWidth()
        ) {

            Text("Get Location")
        }

        Spacer(
            Modifier.height(20.dp)
        )

        Button(
            onClick = { },

            modifier =
                Modifier.fillMaxWidth()
        ) {

            Text("Submit Report")
        }
        Spacer(
            Modifier.height(20.dp)
        )

        Box(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .border(
                        1.dp,
                        Color.Gray
                    ),

            contentAlignment =
                Alignment.Center
        ) {

            Text(
                "Tap to Upload Image"
            )
        }
    }
}