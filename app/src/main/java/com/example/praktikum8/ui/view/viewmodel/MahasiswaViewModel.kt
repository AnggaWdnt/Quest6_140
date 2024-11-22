package com.example.praktikum8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.praktikum8.ui.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel: ViewModel(){
    private val _stateUI = MutableStateFlow(Mahasiswa())
    val stateUI: StateFlow<Mahasiswa> = _stateUI.asStateFlow()
    fun setMahasiswa(ls:MutableList<String>){
        _stateUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2]
            )
        }
    }
    fun setMatakuliah(ls: MutableList<String>){
        _stateUI.update { statusSaatIni ->
            statusSaatIni.copy(
                namaMatakuliah = ls[0],
                kelas = ls[1],
            )
        }
    }
}