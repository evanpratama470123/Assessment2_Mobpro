package com.evanpratama0137.ciciluang.navigation

import com.evanpratama0137.ciciluang.ui.screen.KEY_ID_TABUNGAN

sealed class Screen(val route: String) {
    data object Home: Screen("mainscreen")
    data object FormBaru: Screen("detailscreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_TABUNGAN}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}