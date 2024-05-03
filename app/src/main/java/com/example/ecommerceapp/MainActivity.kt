package com.example.ecommerceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecommerceapp.feature_.presentation.ecom_home.HomeViewModel
import com.example.ecommerceapp.feature_.presentation.ecom_home.MainScreen
import com.example.ecommerceapp.feature_.presentation.util.Screen
import com.example.ecommerceapp.ui.theme.EcommerceAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcommerceAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    val navController = rememberNavController()
                    val homeViewModel: HomeViewModel = hiltViewModel()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.MainScreen.route,
                    ){
                        composable(route = Screen.MainScreen.route){
                            MainScreen()
                        }
                    }
                }
            }
        }
    }
}
