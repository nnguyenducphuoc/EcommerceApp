package com.example.ecommerceapp.feature_.presentation.util

sealed class Screen(val route: String){
    data object MainScreen: Screen("main_screen")
}