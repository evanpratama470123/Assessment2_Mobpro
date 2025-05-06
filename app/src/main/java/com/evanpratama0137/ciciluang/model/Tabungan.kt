package com.evanpratama0137.ciciluang.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabungan")
data class Tabungan(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val nama: String,
    val jumlah: Int,
    val deskripsi: String,
    val tanggal: String
)

