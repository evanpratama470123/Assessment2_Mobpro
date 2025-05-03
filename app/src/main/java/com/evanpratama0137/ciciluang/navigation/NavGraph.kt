package com.evanpratama0137.ciciluang.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.evanpratama0137.ciciluang.ui.screen.DetailScreen
import com.evanpratama0137.ciciluang.ui.screen.KEY_ID_TABUNGAN
import com.evanpratama0137.ciciluang.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            MainScreen(navController)
        }
        composable(route = Screen.FormBaru.route) {
            DetailScreen(navController)
        }
        composable(
            route = Screen.FormUbah.route,
            arguments = listOf(
                navArgument(KEY_ID_TABUNGAN) { type = NavType.LongType })
        ) {  navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getLong(KEY_ID_TABUNGAN)
            DetailScreen(navController, id)
        }
    }
}