package com.example.newsapp.NavGraph

import kotlinx.serialization.Serializable


sealed class Routes {
   @Serializable
    object Mainui

    @Serializable
    object Aboutme

}