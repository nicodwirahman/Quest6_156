package com.example.pertemuan8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.data.MataKuliah
import com.example.pertemuan8.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy(namaMK = mkPilihan) } }

    fun setkelas(kelaspilihan: String) {
        _krsState.update { statekelas -> statekelas.copy(kelas = kelaspilihan) }
    }

    fun saveDataKRS(ls: MutableList<String>) {
        _krsState.update { status ->
            status.copy(
                namaMK = ls[0],
                kelas = ls[1]
            )
        }
    }
}
