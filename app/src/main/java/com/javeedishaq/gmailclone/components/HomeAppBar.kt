package com.javeedishaq.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javeedishaq.gmailclone.GmailApp
import com.javeedishaq.gmailclone.ui.theme.GmailCloneTheme
import com.javeedishaq.gmailclone.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope, openDialog: MutableState<Boolean>) {

    Box(modifier = Modifier.padding(10.dp)) {
        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 6.dp) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                IconButton(onClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }) {
                    Icon(Icons.Default.Menu, contentDescription = "Menu")
                }
                Text(text = "Search in emails"
                )
                Image(
                    painter = painterResource(id = R.drawable.gmailicon),
                    contentDescription = "",
                    modifier = Modifier.clickable {
                               openDialog.value = true
                    },
                )
                
                if (openDialog.value){
                    AccountDialog(openDialog = openDialog)
                }

            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailCloneTheme {
        GmailApp()
    }
}