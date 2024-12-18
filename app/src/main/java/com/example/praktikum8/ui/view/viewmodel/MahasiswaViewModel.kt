package com.example.praktikum8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.praktikum8.ui.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel: ViewModel(){

    private val _mahasiswasUiState = MutableStateFlow(Mahasiswa())

    val mahasiswaUiState: StateFlow<Mahasiswa> = _mahasiswasUiState.asStateFlow()

    fun saveDataMahasiswa(ls: MutableList<String>){
        _mahasiswasUiState.update { statusSaatIni ->
            statusSaatIni.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2]
            )
        }
    }
}