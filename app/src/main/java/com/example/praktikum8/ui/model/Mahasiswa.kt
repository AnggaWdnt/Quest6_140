package com.example.praktikum8.ui.model

import android.provider.ContactsContract.CommonDataKinds.Email

data class Mahasiswa(
    val nim: String ="",
    val nama: String ="",
    val email: String ="",
    val namaMatakuliah: String="",
    val kelas: String ="",
)
