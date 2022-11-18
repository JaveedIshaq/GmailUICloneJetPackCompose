package com.javeedishaq.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GmailFab(scrollState: ScrollState) {

    if (scrollState.value > 100) {

        ExtendedFloatingActionButton(
            text = { Text(text = "Compose", fontSize = 16.sp) },
            onClick = { /*TODO*/ },
            icon = {Icon(imageVector = Icons.Default.Edit, contentDescription = "")},
            backgroundColor = MaterialTheme.colors.surface
        )


    } else {
        FloatingActionButton(onClick = { }, backgroundColor = MaterialTheme.colors.surface) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "")
        }
    }


}