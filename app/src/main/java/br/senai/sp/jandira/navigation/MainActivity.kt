package br.senai.sp.jandira.navigation

import MenuScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.navigation.screen.login.LoginScreen
import br.senai.sp.jandira.navigation.screen.pedidos.PedidosScreen
import br.senai.sp.jandira.navigation.screen.perfil.PerfilScreen
import br.senai.sp.jandira.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // criamos a variavel rememberNavController que vai se
                    // lembrar da pilha de telas
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {
                        // login é um apelido
                        // para cada tela devemos ter uma rota, sendo seu start a tela de login
                        composable(route = "login"){ LoginScreen(navController) }
                        composable(route = "menu"){ MenuScreen() }
                        composable(route = "perfil"){ PerfilScreen() }
                        composable(route = "pedido"){ PedidosScreen() }

                    }
                }
            }
        }
    }
}

