package com.example.buylocal.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.buylocal.ui.screens.StartScreen
import com.example.buylocal.ui.screens.LoginScreen // To be created
import com.example.buylocal.ui.screens.OtpScreen    // To be created

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "start") {
        composable("start") { StartScreen(navController) }
        composable("login") { LoginScreen(navController) } // Placeholder
        composable("otp?phone={phone}") { backStackEntry ->
            val phone = backStackEntry.arguments?.getString("phone") ?: ""
            OtpScreen(navController, phone)
        }


    }
}
