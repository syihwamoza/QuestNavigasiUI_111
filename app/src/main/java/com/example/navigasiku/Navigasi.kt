package com.example.navigasiku

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigasiku.view.FormIsian
import com.example.navigasiku.view.TampilData
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navControlller: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navControlller,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding(isiRuang)
        ) {
            composable(route = Navigasi.Formulirku.name) {
                FormIsian(
                    //pilihanJK = JenisK.map { id -> konteks.resources.getString(id)}
                    OnSubmitBtnClick = {
                        navControlller.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    onBackClick = {
                        cancelAndBackToFormulirku(navControlller)
                    }
                )
            }
        }
    }
}
private fun cancelAndBackToFormulirku(
    navController: NavHostController
) {
    navController.popBackStack(
        Navigasi.Formulirku.name,
        inclusive = false
    )
}


