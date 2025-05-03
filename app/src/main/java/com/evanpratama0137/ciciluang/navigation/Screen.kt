package com.evanpratama0137.ciciluang.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("mainscreen")
    data object FormBaru: Screen("detailscreen")
}