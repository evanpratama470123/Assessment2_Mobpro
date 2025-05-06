package com.evanpratama0137.ciciluang.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.evanpratama0137.ciciluang.model.Tabungan
import kotlinx.coroutines.flow.Flow

@Dao
interface TabunganDao {

    @Insert
    suspend fun insert(tabungan: Tabungan)

    @Update
    suspend fun update(tabungan: Tabungan)

    @Query("SELECT * FROM tabungan ORDER BY jumlah DESC")
    fun getTabungan(): Flow<List<Tabungan>>

    @Query("SELECT * FROM tabungan WHERE id = :id")
    suspend fun getTabunganById(id: Long): Tabungan?

    @Query("DELETE FROM tabungan WHERE id = :id")
    suspend fun deleteById(id: Long)

}