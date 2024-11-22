package com.example.pertemuan8.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pertemuan8.R
import com.example.pertemuan8.model.Mahasiswa

//@Preview(showBackground = true)

@Composable
fun TampilView(
    uistate: Mahasiswa,
    onbackbuttonClicked: () -> Unit,
    onResetButtonClicked: () -> Unit,

    ) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
}

}
