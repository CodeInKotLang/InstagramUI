package com.synac.instagramuipractice.main_feed_screen

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.synac.instagramuipractice.R

@Composable
fun TopBar() {

    val instagramFont = FontFamily(
        Font(R.font.instagram_logo_font)
    )

    TopAppBar(
        title = {
            Text(
                modifier = Modifier.offset(y = 5.dp),
                text = "Instagram",
                fontFamily = instagramFont,
                fontSize = 35.sp,
                color = Color.Black
            )
        },
        backgroundColor = Color.White,
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = "Add Post",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_send),
                    contentDescription = "Send Message",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }
        },
        elevation = 2.dp
    )
}


@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}