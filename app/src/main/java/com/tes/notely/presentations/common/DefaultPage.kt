package com.tes.notely.presentations.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tes.notely.presentations.onboarding.Page

@Composable
fun DefaultPage(
	modifier: Modifier = Modifier,
	page: Page
) {
	Column(modifier = modifier.padding(34.dp), horizontalAlignment = Alignment.CenterHorizontally) {
		Image(
			painter = painterResource(id = page.image),
			contentDescription = "",
			modifier = Modifier.size(width = 300.dp, height = 200.dp),

			)
		Spacer(modifier = Modifier.height(28.dp))
		Text(
			text = page.title,
			fontSize = 24.sp,
			fontWeight = FontWeight.Black,
			lineHeight = 32.sp,
			textAlign = TextAlign.Center
		)
		Spacer(modifier = Modifier.height(12.dp))
		Text(
			text = page.description,
			textAlign = TextAlign.Center,
			fontWeight = FontWeight.Bold,
			lineHeight = 24.sp,
			fontSize = 15.sp
		)
	}

}
