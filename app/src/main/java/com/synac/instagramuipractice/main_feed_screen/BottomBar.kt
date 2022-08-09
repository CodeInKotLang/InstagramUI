package com.synac.instagramuipractice.main_feed_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.synac.instagramuipractice.R

@Composable
fun BottomBar() {
    BottomAppBar(
        backgroundColor = Color.White
    ) {
        var selectedScreen by remember { mutableStateOf(Screens.Home.route) }

        val homeIcon = if (selectedScreen == Screens.Home.route) {
            painterResource(R.drawable.ic_home_filled)
        } else painterResource(R.drawable.ic_home_outline)

        val searchIcon = if (selectedScreen == Screens.Search.route) {
            painterResource(R.drawable.ic_search_dark)
        } else painterResource(R.drawable.ic_search)

        val reelsIcon = if (selectedScreen == Screens.Reels.route) {
            painterResource(R.drawable.ic_reels_filled)
        } else painterResource(R.drawable.ic_reels_outline)

        val likeIcon = if (selectedScreen == Screens.Like.route) {
            painterResource(R.drawable.ic_love_filled)
        } else painterResource(R.drawable.ic_love_outline)


        BottomNavigationItem(
            selected = selectedScreen == Screens.Home.route,
            onClick = { selectedScreen = Screens.Home.route },
            icon = {
                Icon(
                    painter = homeIcon,
                    contentDescription = "Home Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        BottomNavigationItem(
            selected = selectedScreen == Screens.Search.route,
            onClick = { selectedScreen = Screens.Search.route },
            icon = {
                Icon(
                    painter = searchIcon,
                    contentDescription = "Search Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        BottomNavigationItem(
            selected = selectedScreen == Screens.Reels.route,
            onClick = { selectedScreen = Screens.Reels.route },
            icon = {
                Icon(
                    painter = reelsIcon,
                    contentDescription = "Reels Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        BottomNavigationItem(
            selected = selectedScreen == Screens.Like.route,
            onClick = { selectedScreen = Screens.Like.route },
            icon = {
                Icon(
                    painter = likeIcon,
                    contentDescription = "Like Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        BottomNavigationItem(
            selected = selectedScreen == Screens.Profile.route,
            onClick = { selectedScreen = Screens.Profile.route },
            icon = {
                if (selectedScreen == Screens.Profile.route) {
                    Image(
                        painter = painterResource(R.drawable.jon_snow),
                        contentDescription = "Profile Icon",
                        modifier = Modifier
                            .size(30.dp)
                            .clip(CircleShape)
                            .border(width = 2.dp, color = Color.Black, shape = CircleShape)
                    )
                } else {
                    Image(
                        painter = painterResource(R.drawable.jon_snow),
                        contentDescription = "Profile Icon",
                        modifier = Modifier
                            .size(30.dp)
                            .clip(CircleShape)
                    )
                }
            }
        )
    }
}

sealed class Screens(val route: String) {
    object Home: Screens("home")
    object Search: Screens("search")
    object Reels: Screens("reals")
    object Like: Screens("like")
    object Profile: Screens("profile")
}

