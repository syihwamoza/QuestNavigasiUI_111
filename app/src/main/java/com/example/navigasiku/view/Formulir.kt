package com.example.navigasiku.view

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    jenisK:List<String> = ListOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier= Modifier,
        topBar={
            TopAppBar(
                title = {Text (stringResources(id= R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (colorResources(id = R.color.teal_700))
            )
        })
}

@Composable
fun ListOf(x0: String, x1: String) {
    TODO("Not yet implemented")
}