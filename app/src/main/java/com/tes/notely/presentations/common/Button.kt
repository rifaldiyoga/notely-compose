package com.tes.notely.presentations.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tes.notely.ui.theme.NotelyTheme

@Composable
fun CustomButton(
	text: String,
	modifier: Modifier,
	onClick: () -> Unit,
) {
	Box(
		modifier = modifier
	) {
		Button(
			onClick = onClick,
			colors = ButtonDefaults.buttonColors(
				containerColor = MaterialTheme.colorScheme.primary,
				contentColor = MaterialTheme.colorScheme.primary
			),
			shape = RoundedCornerShape(size = 12.dp),
		) {
			Text(
				modifier = Modifier
					.fillMaxWidth()
					.padding(24.dp),
				text = text.uppercase(),
				fontSize = 18.sp,
				textAlign = TextAlign.Center,
				style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.ExtraBold),
				color = MaterialTheme.colorScheme.onPrimary
			)
		}
	}
}

@Composable
fun CustomTextButton(
	text: String,
	onClick: () -> Unit,
) {
	TextButton(onClick = onClick) {
		Text(
			text = text,
			style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
			color = MaterialTheme.colorScheme.primary
		)
	}
}

@Preview(showBackground = true)
@Composable
fun CustomButtonPreview() {
	NotelyTheme {
		CustomButton(text = "Login", modifier = Modifier, onClick = {})
	}
}

@Preview(showBackground = true)
@Composable
fun CustomTextButtonPreview() {
	NotelyTheme {
		CustomButton(text = "Login", modifier = Modifier, onClick = {})
	}
}