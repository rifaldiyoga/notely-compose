package com.tes.notely.presentations.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tes.notely.presentations.common.CustomButton
import com.tes.notely.presentations.common.DefaultPage
import com.tes.notely.presentations.common.Toolbar
import com.tes.notely.presentations.onboarding.components.PagerIndicator
import com.tes.notely.ui.theme.NotelyTheme

@Composable
fun OnBoardingScreen() {
	Column(
		modifier = Modifier
			.fillMaxSize()
			.padding(bottom = 28.dp),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.spacedBy(12.dp)
	) {
		val pagerState = rememberPagerState(initialPage = 0) {
			pages.size
		}

		Toolbar()

		Spacer(modifier = Modifier.weight(1f))

		HorizontalPager(state = pagerState) { index ->
			DefaultPage(Modifier, pages[index])
		}

		PagerIndicator(
			modifier = Modifier,
			pagesSize = pages.size,
			selectedPage = pagerState.currentPage
		)

		Spacer(modifier = Modifier.weight(1f))

		Box(modifier = Modifier.padding(horizontal = 28.dp)) {
			CustomButton(text = "Get Started", Modifier.fillMaxWidth(), onClick = {})
		}

	}

}

@Preview(showBackground = true)
@Composable
fun OnBoardingPagePreview() {
	NotelyTheme {
		OnBoardingScreen()
	}
}
