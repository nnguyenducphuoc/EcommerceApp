package com.example.ecommerceapp.feature_.presentation.ecom_home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ecommerceapp.feature_.presentation.ecom_home.components.CartScreen
import com.example.ecommerceapp.feature_.presentation.ecom_home.components.HomeScreen
import com.example.ecommerceapp.feature_.presentation.ecom_home.components.ProfileScreen
import com.example.ecommerceapp.feature_.presentation.ecom_home.components.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.HomeScreen.route
    ) {
        composable(route = BottomBarScreen.HomeScreen.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.ProfileScreen.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.SettingsScreen.route) {
            SettingsScreen()
        }
        composable(route = BottomBarScreen.CartScreen.route) {
            CartScreen()
        }
    }
}