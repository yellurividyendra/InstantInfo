package com.example.newsapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.navigation.compose.rememberNavController
import com.example.newsapp.Screen.Mainui
import com.example.newsapp.Screen.NewsViewModel
import com.example.newsapp.ui.theme.NewsAppTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: NewsViewModel by viewModels()
        setContent {
            NewsAppTheme {
                val navController = rememberNavController()
                val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
                    rememberTopAppBarState()
                )
                Mainui(
                        viewModel = viewModel,
                navHostController = navController
                )

//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Box(
//                        modifier = Modifier
//                            .fillMaxSize()
//                    ) {
//                        if (viewModel.res.value == null) {
//                            Column(
//                                modifier = Modifier.fillMaxSize(),
//                                horizontalAlignment = Alignment.CenterHorizontally,
//                                verticalArrangement = Arrangement.Center
//                            ) {
//                                CircularProgressIndicator()
//                            }
//                        } else {
//                            HomeApp(viewModel = viewModel)
//
//                        }

//                    }
//                }
            }
        }
    }
}


//
//@Composable
//fun MyScreen() {
//    val api = remember { ApiProvider.provideApi() }
//    LaunchedEffect(Unit) {
//        val test = api.getNewsFromServer().body()
//        Log.d("My_testing", "OnCreate: $test")
//    }
//}
