package modulo_05.ejercicio_10.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import modulo_05.ejercicio_10.HomeView
import modulo_05.ejercicio_10.ContentIMCView
import modulo_05.ejercicio_10.IMCView
import modulo_05.ejercicio_10.viewmodel.IMCViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.Home.route,

    ) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.Home.route) {
            HomeView(navController)
        }
        composable(NavigationItem.IMCView.route) {
            IMCView(navController=navController)
        }
    }
}
