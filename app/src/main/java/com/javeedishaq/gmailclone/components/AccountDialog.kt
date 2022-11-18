package com.javeedishaq.gmailclone.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.javeedishaq.gmailclone.R
import com.javeedishaq.gmailclone.models.MailData

@Composable
fun AccountDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountsDialogUI()
    }
}


@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier) {
    Card() {
        Column(modifier
            .background(Color.White)
            .padding(16.dp)) {
            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Icon(Icons.Default.Close, contentDescription = "Close")
                Image(
                    painter = painterResource(id = R.drawable.gmailicon),
                    contentDescription = "",
                    modifier = Modifier.size(40.dp)

                )
            }

            //
            MailItem(
                mailData = MailData(
                    mailId = 4,
                    userName = "Javeed Ishaq",
                    userMail = "henry@gmail.com",
                    subject = "Some Important EMail",
                    mailText = "This is regarding an important opputinity",
                    timeStamp = "10.22",
                ),
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Card(
                    modifier = Modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, color = Color.Gray)
                ) {
                    Text(
                        text = "Read More",
                        modifier.padding(8.dp),
                        textAlign = TextAlign.Center,
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun AccountsDialogUIPreview() {
    AccountsDialogUI()
}