package com.synac.instagramuipractice.main_feed_screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.synac.instagramuipractice.R
import com.synac.instagramuipractice.model.User

@Composable
fun StoryWidget(
    user: User
) {
    val storiesFont = FontFamily(
        Font(R.font.robotocondensed)
    )
    Box(
        modifier = Modifier.padding(10.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Canvas(
            modifier = Modifier.size(80.dp)
        ) {
            val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
            drawCircle(
                brush = Brush.linearGradient(instaColors),
                style = Stroke(width = 15f, cap = StrokeCap.Round)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .border(
                        width = 3.dp,
                        color = Color.White,
                        shape = CircleShape
                    ),
                painter = user.profilePic,
                contentDescription = "Story",
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = user.username,
                color = Color.DarkGray,
                fontFamily = storiesFont
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun StoryWidgetPrev() {
    StoryWidget(
        User(
            profilePic = painterResource(R.drawable.daenerys_targaryen),
            username = "queen_daenerys",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.daenerys_targaryen_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        )
    )
}