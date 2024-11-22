package com.example.praktikum8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.praktikum8.ui.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMatakuliah(mkPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy(namaMK = mkPilihan) }
    }

    fun setKelas(KelasPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy(kelas = KelasPilihan) }
    }

    fun saveDataKRS(ls: MutableList<String>) {
        _krsState.update { stateMK -> stateMK.copy(
                namaMK = ls[0],
                kelas = ls[1]
            )
        }
    }
}