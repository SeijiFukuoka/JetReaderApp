package br.com.jetreaderapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.jetreaderapp.screens.ReaderSplashScreen
import br.com.jetreaderapp.screens.details.ReaderDetailsScreen
import br.com.jetreaderapp.screens.home.ReaderHomeScreen
import br.com.jetreaderapp.screens.login.ReaderLoginScreen
import br.com.jetreaderapp.screens.search.ReaderSearchScreen
import br.com.jetreaderapp.screens.stats.ReaderStatsScreen
import br.com.jetreaderapp.screens.update.ReaderUpdateScreen

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ReaderNavigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ReaderScreens.SplashScreen.name
    ) {

        composable(ReaderScreens.SplashScreen.name) {
            ReaderSplashScreen(navController = navController)
        }
        composable(ReaderScreens.HomeScreen.name) {
            ReaderHomeScreen(navController = navController)
        }
        composable(ReaderScreens.SearchScreen.name) {
            ReaderSearchScreen(navController = navController)
        }
        composable(ReaderScreens.DetailScreen.name) {
            ReaderDetailsScreen(navController = navController)
        }
        composable(ReaderScreens.LoginScreen.name) {
            ReaderLoginScreen(navController = navController)
        }
        composable(ReaderScreens.StatsScreen.name) {
            ReaderStatsScreen(navController = navController)
        }
        composable(ReaderScreens.UpdateScreen.name) {
            ReaderUpdateScreen(navController = navController)
        }
    }
}