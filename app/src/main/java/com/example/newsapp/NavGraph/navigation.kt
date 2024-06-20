package com.example.newsapp.NavGraph

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.newsapp.Screen.AboutMe
import com.example.newsapp.Screen.Mainui
import com.example.newsapp.Screen.NewsViewModel



@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation(navHostController: NavHostController, viewModel: NewsViewModel) {

    NavHost(navController = navHostController, startDestination = Routes.Mainui ){

        composable<Routes.Mainui> {
            Mainui(navHostController = navHostController , viewModel = viewModel as NewsViewModel)

        }

        composable<Routes.Aboutme> {
            AboutMe(navHostController=navHostController)
        }
    }
}