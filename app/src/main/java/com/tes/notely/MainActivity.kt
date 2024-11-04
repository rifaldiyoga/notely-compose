package com.tes.notely

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tes.notely.presentations.home.HomeScreen
import com.tes.notely.presentations.onboarding.OnBoardingScreen
import com.tes.notely.ui.theme.NotelyTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			NotelyTheme {
				Box(modifier = Modifier.fillMaxSize()) {
					HomeScreen()
				}
			}
		}
	}
}

@Preview
@Composable
fun MainPreview() {
	NotelyTheme {
		Box(modifier = Modifier.fillMaxSize()) {
			OnBoardingScreen()
		}
	}
}
