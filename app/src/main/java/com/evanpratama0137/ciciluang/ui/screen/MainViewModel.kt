package com.evanpratama0137.ciciluang.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evanpratama0137.ciciluang.database.TabunganDao
import com.evanpratama0137.ciciluang.model.Tabungan
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel(dao: TabunganDao) : ViewModel() {

    val data: StateFlow<List<Tabungan>> = dao.getTabungan().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )

    fun getCatatan(id: Long): Tabungan? {
        return data.value.find { it.id == id }
    }
}