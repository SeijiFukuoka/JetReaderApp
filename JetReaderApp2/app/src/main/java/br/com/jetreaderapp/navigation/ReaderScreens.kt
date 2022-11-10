package br.com.jetreaderapp.navigation

enum class ReaderScreens {
    SplashScreen,
    LoginScreen,
    HomeScreen,
    SearchScreen,
    DetailScreen,
    UpdateScreen,
    StatsScreen;

    companion object {
        fun fromRoute(route: String?): ReaderScreens =
            when (route?.substringBefore("/")) {
                SplashScreen.name -> SplashScreen
                LoginScreen.name -> LoginScreen
                HomeScreen.name -> HomeScreen
                SearchScreen.name -> SearchScreen
                DetailScreen.name -> DetailScreen
                UpdateScreen.name -> UpdateScreen
                StatsScreen.name -> StatsScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("Route $route not implemented yet")
            }
    }
}