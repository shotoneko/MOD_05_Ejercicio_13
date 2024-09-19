package modulo_05.ejercicio_10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import modulo_05.ejercicio_10.navigation.AppNavHost
import modulo_05.ejercicio_10.ui.theme.Ejercicio_10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio_10Theme {
               AppNavHost(navController = rememberNavController())
               //HomeView()

            }
        }
    }
}
