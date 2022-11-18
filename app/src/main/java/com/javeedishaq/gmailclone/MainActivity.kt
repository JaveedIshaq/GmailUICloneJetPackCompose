package com.javeedishaq.gmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javeedishaq.gmailclone.components.*
import com.javeedishaq.gmailclone.components.HomeAppBar
import com.javeedishaq.gmailclone.ui.theme.GmailCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val mailsScrollState = rememberScrollState()
    val openDialog = remember{
        mutableStateOf(false)
    }
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { HomeAppBar(scaffoldState, coroutineScope, openDialog = openDialog) },
        drawerContent = {
            GmailDrawerMenu(scrollState)
        },
        bottomBar = { BottomNavigation() },
        floatingActionButton = { GmailFab(scrollState = mailsScrollState) }
    ) {
        MailList(paddingValues = PaddingValues(12.dp), scrollState = mailsScrollState)
        Spacer(modifier = Modifier.padding(bottom = 100.dp))
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailCloneTheme {
        GmailApp()
    }
}