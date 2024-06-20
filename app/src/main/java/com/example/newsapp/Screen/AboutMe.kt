package com.example.newsapp.Screen

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.newsapp.R

@Composable
fun AboutMe(navHostController: NavHostController) {
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.primary)
                .padding(horizontal = 16.dp, vertical = 20.dp)
        ) {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                        horizontalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "About Developer",
                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                    color = Color.White

                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            // Divider
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(color = Color.Green)
            )

            // Content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 40.dp)
            ) {
                // Profile pic
                Card(
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.coding),
                        contentDescription = "Developer Profile Pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Name
                Text(
                    text = "Yelluri Vidyendra",
                    style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
                    color = Color.Green
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Bio
                Text(
                    text = ">A passionate developer from India Pursuing Btech 3rd year in Indian Institute Of Information Technology Lucknow",
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                    color = Color.Gray
                )

                Spacer(modifier = Modifier.height(30.dp))

                // Follow me
                Text(
                    text = "Follow me",
                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                    color = Color.White
                )

                // Social media buttons
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)



                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        IconButton(
                            onClick = { openUrl(context, "https://twitter.com/vidhyendra") },
                            modifier = Modifier.size(35.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.twitter),
                                contentDescription = "Twitter"
                            )
                        }
                        IconButton(
                            onClick = { openUrl(context, "https://github.com/yellurividyendra") },
                            modifier = Modifier.size(34.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.github),
                                contentDescription = "Github"
                            )
                        }
                        IconButton(
                            onClick = { openUrl(context, "https://www.instagram.com/y.vidyendra/") },
                            modifier = Modifier.size(34.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.instagram),
                                contentDescription = "Instagram"
                            )
                        }
                        IconButton(
                            onClick = { openUrl(context, "https://www.linkedin.com/in/yelluri-vidyendra-3ba785259/") },
                            modifier = Modifier.size(35.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.linkedin),
                                contentDescription = "Linkedin"
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}
    fun openUrl(context: android.content.Context, url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        context.startActivity(intent)
    }
//
//    @Preview(showBackground = true, showSystemUi = true)
//    @Composable
//    fun AboutMePreview() {
//        NewsAppTheme {
//            AboutMe(navHostController = NavHostController())
//        }
//    }
