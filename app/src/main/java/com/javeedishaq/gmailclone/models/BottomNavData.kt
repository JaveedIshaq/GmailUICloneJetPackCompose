package com.javeedishaq.gmailclone.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavData(
    val icon: ImageVector? = null, val title: String? = null
) {

    object Mail : BottomNavData(
        icon = Icons.Outlined.Email,
        title = "Mail"
    )

    object Meet : BottomNavData(
        icon = Icons.Outlined.VideoCall,
        title = "Meet"
    )

}