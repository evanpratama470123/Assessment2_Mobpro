package com.evanpratama0137.ciciluang.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evanpratama0137.ciciluang.database.TabunganDao
import com.evanpratama0137.ciciluang.model.Tabungan
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class DetailViewModel(private val dao: TabunganDao) : ViewModel()  {

    private val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)

    fun insert(nama: String, jumlah: Int, deskripsi: String) {
        val tabungan = Tabungan(
            nama = nama,
            jumlah = jumlah,
            deskripsi = deskripsi,
            tanggal = formatter.format(Date())
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(tabungan)
        }
    }

    suspend fun getTabungan(id: Long): Tabungan? {
        return dao.getTabunganById(id)
    }

    fun update(id: Long, nama: String, jumlah: Int, deskripsi: String) {
        val tabungan = Tabungan(
            id = id,
            nama = nama,
            jumlah = jumlah,
            deskripsi = deskripsi,
            tanggal = formatter.format(Date())
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.update(tabungan)
        }
    }

    fun delete(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.deleteById(id)
        }
    }
}