package com.javeedishaq.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javeedishaq.gmailclone.models.DrawerMenuData


@Composable
fun GmailDrawerMenu(scrollState: ScrollState) {


    val menuList = listOf<DrawerMenuData>(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderAllLables,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.HeaderGoogleApps,
        DrawerMenuData.Calendar,
        DrawerMenuData.Contacts,
        DrawerMenuData.Settings,
        DrawerMenuData.Help
    )

    Column (Modifier.verticalScroll(scrollState)){
        Text(
            text = "Gmail",
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp
            )
        )

        menuList.forEach { item ->
            when {
                item.isDivider -> {
                    Divider(modifier = Modifier.padding(bottom = 20.dp, top = 20.dp))
                }
                item.isHeader -> {
                    Text(
                        text = item.title!!,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(start = 20.dp, bottom = 20.dp, top = 20.dp),
                    )
                }
                else -> {
                    MailDrawerItme(item = item)
                }
            }

        }
    }
}


@Composable
fun MailDrawerItme(item: DrawerMenuData) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .padding(top = 16.dp, start = 20.dp)) {

        Image(imageVector = item.icon!!,
            contentDescription = item.title!!,
            modifier = Modifier.padding(end = 10.dp))
        Text(text = item.title, modifier = Modifier.weight(2.0f))
    }
}