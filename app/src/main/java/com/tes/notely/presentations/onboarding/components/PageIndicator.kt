package com.tes.notely.presentations.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PagerIndicator(
	modifier: Modifier = Modifier,
	pagesSize: Int,
	selectedPage: Int,
	selectedColor: Color = MaterialTheme.colorScheme.primary,
	unselectedColor: Color = MaterialTheme.colorScheme.secondary,
) {
	Row(modifier = modifier, horizontalArrangement = Arrangement.spacedBy(6.dp), verticalAlignment = Alignment.CenterVertically) {
		repeat(times = pagesSize) { page ->
			Box(
				modifier = Modifier
					.size(if(page == selectedPage) 10.dp else 8.dp)
					.clip(RoundedCornerShape(20))
					.background(color = if (page == selectedPage) selectedColor else unselectedColor)
			)
		}
	}
}

@Preview(showBackground = true)
@Composable
fun PagerIndicatorPreview() {
	PagerIndicator(pagesSize = 3, selectedPage = 1)
}