package com.tes.notely.presentations.home.component

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tes.notely.R
import kotlin.random.Random

fun Modifier.shimmerEffect() = composed {
	val transition = rememberInfiniteTransition(label = "")
	val alpha = transition.animateFloat(
		initialValue = 0.2f, targetValue = 0.9f, animationSpec = infiniteRepeatable(
			animation = tween(durationMillis = 1000),
			repeatMode = RepeatMode.Reverse
		), label = ""
	).value
	background(color = colorResource(id = R.color.shimmer).copy(alpha = alpha))
}

@Composable
fun NoteCardShimmerEffect() {
	val randomNumber by rememberSaveable { mutableIntStateOf(Random.nextInt(3, 12)) }

	Box(
		modifier = Modifier
			.clip(RoundedCornerShape(12.dp))
			.background(color = Color.White)
	) {
		Column(modifier = Modifier.padding(16.dp)) {
			Box(
				modifier = Modifier
					.width(100.dp)
					.height(10.dp)
					.shimmerEffect()
			)
			Spacer(modifier = Modifier.height(8.dp))
			Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
				repeat(randomNumber) {
					Box(
						modifier = Modifier
							.fillMaxWidth()
							.height(10.dp)
							.shimmerEffect()
					)
				}

			}

			Spacer(modifier = Modifier.height(6.dp))
		}
	}
}

@Preview
@Composable
fun NoteCardShimmerEffectPreview() {
	NoteCardShimmerEffect()
}