package com.evanpratama0137.ciciluang.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.evanpratama0137.ciciluang.R
import com.evanpratama0137.ciciluang.model.Tabungan
import com.evanpratama0137.ciciluang.ui.theme.CicilUangTheme
import com.evanpratama0137.ciciluang.ui.theme.WarnaContainer
import com.evanpratama0137.ciciluang.ui.theme.WarnaText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = WarnaContainer,
                    titleContentColor = WarnaText,
                )
            )
        }
    ) { innerPadding ->
        ScreenContent(Modifier.padding(innerPadding))
    }
}

@Composable
fun ScreenContent(modifier: Modifier = Modifier) {
    val viewModel: MainViewModel = viewModel()
    val data = viewModel.data

    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        items(data) {
            ListItem(it)
            HorizontalDivider()
        }
    }
}

@Composable
fun ListItem(tabungan: Tabungan) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = tabungan.nama,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = tabungan.jumlah.toString(),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = tabungan.deskripsi,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(text = tabungan.tanggal)
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun MainScreenPreview() {
    CicilUangTheme {
        MainScreen()
    }
}