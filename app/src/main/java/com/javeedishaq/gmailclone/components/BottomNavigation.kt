package com.javeedishaq.gmailclone.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.javeedishaq.gmailclone.models.BottomNavData

@Composable
fun BottomNavigation() {

    val bottomMenuItems = listOf<BottomNavData>(
        BottomNavData.Mail,
        BottomNavData.Meet
    )

    BottomNavigation(backgroundColor = Color.White, contentColor = Color.Black) {
        bottomMenuItems.forEach {
            BottomNavigationItem(
                label = { Text(it.title!!) },
                icon = { Icon(imageVector = it.icon!!, contentDescription = it.title)},
                alwaysShowLabel = true,
                selected = false,
                onClick = { },
                enabled = true,
            );
        }
    }



}