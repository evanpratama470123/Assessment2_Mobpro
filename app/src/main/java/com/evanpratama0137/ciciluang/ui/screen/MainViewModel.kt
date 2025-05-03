package com.evanpratama0137.ciciluang.ui.screen

import androidx.lifecycle.ViewModel
import com.evanpratama0137.ciciluang.model.Tabungan

class MainViewModel : ViewModel() {

    val data = listOf(
        Tabungan(
            1,
            "Tabungan Laptop",
            10_000_000,
            "Tabungan ini diperuntukkan untuk membeli laptop. Laptop harganya mahal, tentu perlu uang dalam jumlah besar.",
            "2025-06-20"
        ),
        Tabungan(
            2,
            "Tabungan HP",
            3_500_000,
            "Tabungan ini diperuntukkan untuk membeli HP. Menjelang bulan Juni biasanya banyak promo.",
            "2025-05-25"
        ),
        Tabungan(
            3,
            "Dana Darurat",
            4_000_000,
            "Uang untuk keperluan yang darurat / segera. Jadi ada uang yang bisa dipakai kalau tiba-tiba butuh uang.",
            "2025-06-15"
        ),
        Tabungan(
            4,
            "Tabungan Liburan",
            5_000_000,
            "Tabungan untuk nanti liburan, sebentar lagi masuk musim liburan. Rencana nya sih mau ke Bogor.",
            "2025-05-10"
        ),
        Tabungan(
            5,
            "Tabungan Sekolah",
            4_000_000,
            "Tabungan untuk keperluan sekolah. Jaga-jaga untuk masa depan agar pendidikannya terjaga.",
            "2025-06-10"
        ),
        Tabungan(
            6,
            "Beli Kulkas",
            3_000_000,
            "Belakangan ini lagi butuh kulkas untuk menyimpan makanan yang tidak langsung habis.",
            "2025-05-05"
        )
    )
}