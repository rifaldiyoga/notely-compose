package com.tes.notely.presentations.common

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tes.notely.R

val titanOne = FontFamily(
	Font(R.font.titan_one, FontWeight.Normal)
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar() {
	Surface(color = Color.Red) {
		CenterAlignedTopAppBar(
			title = {
				Text(
					text = "NOTELY",
					fontFamily = titanOne,
					fontSize = 24.sp,

					)
			},
			colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = MaterialTheme.colorScheme.background)
			
		)
	}

}

