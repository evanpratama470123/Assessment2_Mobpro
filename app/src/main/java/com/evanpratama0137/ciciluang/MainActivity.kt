package com.evanpratama0137.ciciluang

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.evanpratama0137.ciciluang.navigation.SetupNavGraph
import com.evanpratama0137.ciciluang.ui.theme.CicilUangTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CicilUangTheme {
                SetupNavGraph()
            }
        }
    }
}

