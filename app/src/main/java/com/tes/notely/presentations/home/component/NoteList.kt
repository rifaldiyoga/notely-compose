package com.tes.notely.presentations.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.tes.notely.R
import com.tes.notely.domain.models.Note
import com.tes.notely.presentations.common.CustomButton
import com.tes.notely.presentations.common.DefaultPage
import com.tes.notely.presentations.onboarding.Page

@Composable
fun NotesList(
	modifier: Modifier = Modifier,
	noteList: List<Note>,
	onClick: (Note) -> Unit
) {

//	val handlePagingResult = handlePagingResult(noteList)

	ShimmerEffect(modifier = modifier.fillMaxSize())

//	LazyVerticalStaggeredGrid(
//		columns = StaggeredGridCells.Fixed(2),
//		modifier = modifier.fillMaxSize(),
//		verticalItemSpacing = 12.dp,
//		horizontalArrangement = Arrangement.spacedBy(12.dp),
//		contentPadding = PaddingValues(all = 16.dp)
//	) {
//		items(
//			count = noteList.size,
//		) {
//			noteList[it].let { article ->
//				NoteCard(note = article)
//			}
//		}
//	}

}

@Composable
fun handlePagingResult(articles: LazyPagingItems<Note>): Boolean {
	val loadState = articles.loadState
	val error = when {
		loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
		loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
		loadState.append is LoadState.Error -> loadState.append as LoadState.Error
		else -> null
	}

	return when {
		loadState.refresh is LoadState.Loading -> {
			ShimmerEffect()
			false
		}

		error != null -> {
			EmptyPage()
			false
		}

		else -> {
			true
		}
	}
}

@Composable
fun EmptyPage() {
	Column(modifier = Modifier) {

		Spacer(modifier = Modifier.weight(1f))
		DefaultPage(
			page = Page(
				title = "Create Your First Note",
				description = "Add a note about anything (your thoughts on climate change, or your history essay) and share it witht the world.",
				image = R.drawable.img_empty
			)
		)
		Spacer(modifier = Modifier.weight(1f))

		CustomButton(text = "Create A Note", Modifier.padding(all = 28.dp), onClick = {})

	}
}

@Composable
fun ShimmerEffect(modifier: Modifier = Modifier) {
	LazyVerticalStaggeredGrid(
		columns = StaggeredGridCells.Fixed(2),
		modifier = modifier.fillMaxSize(),
		verticalItemSpacing = 12.dp,
		horizontalArrangement = Arrangement.spacedBy(12.dp),
		contentPadding = PaddingValues(all = 16.dp)
	) {
		items(
			count = 10,
		) {
			NoteCardShimmerEffect()
		}
	}
}