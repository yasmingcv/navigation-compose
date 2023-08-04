package br.senai.sp.jandira.navigation.screen.perfil

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun PerfilScreen(navController: NavHostController) {
    Column (
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "PERFIL",
            color = Color.White,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier
            .width(200.dp)
            .height(200.dp))
        AnimatedVisibility(
            visible = true,
            enter = fadeIn(tween(30000))
        ) {
            Button(
                onClick = { navController.navigate("menu") },
                modifier = Modifier.width(180.dp),
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "VOLTAR",
                    color = Color.Blue
                )
            }
        }

    }

}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun perfilScreenPreview() {
//    PerfilScreen(navController)
//}