package com.example.praktikum8.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.praktikum8.ui.model.Mahasiswa
import com.example.praktikum8.ui.model.RencanaStudi

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackbuttonClicked: () -> Unit
){
    var choseDropdown by remember {
        mutableStateOf(
            ""
        )
    }
}