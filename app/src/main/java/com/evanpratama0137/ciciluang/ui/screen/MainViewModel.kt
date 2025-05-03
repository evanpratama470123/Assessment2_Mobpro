package com.evanpratama0137.ciciluang.ui.screen

import androidx.lifecycle.ViewModel
import com.evanpratama0137.ciciluang.model.Tabungan

class MainViewModel : ViewModel() {

    val data = listOf(
        Tabungan(
            1,
            "Tabungan Laptop",
            10_000_000,
            "Tabungan ini diperuntukkan untuk membeli laptop",
            "2025-06-20"
        ),
        Tabungan(
            2,
            "Tabungan HP",
            3_500_000,
            "Tabungan ini diperuntukkan untuk membeli HP",
            "2025-05-25"
        ),
        Tabungan(
            3,
            "Dana Darurat",
            4_000_000,
            "Uang untuk keperluan yang darurat / segera",
            "2025-06-15"
        ),
        Tabungan(
            4,
            "Tabungan Liburan",
            5_000_000,
            "Tabungan untuk nanti liburan",
            "2025-05-10"

        )
    )
}