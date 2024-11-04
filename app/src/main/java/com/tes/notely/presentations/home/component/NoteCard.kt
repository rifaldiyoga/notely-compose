package com.tes.notely.presentations.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tes.notely.domain.models.Note
import java.util.Date

@Composable
fun NoteCard(note: Note) {
	Box(
		modifier = Modifier
			.clip(RoundedCornerShape(12.dp))
			.background(color = Color.White)
	) {
		Column(modifier = Modifier.padding(16.dp)) {
			Text(
				text = note.title,
				fontSize = 16.sp,
				style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
			)
			Spacer(modifier = Modifier.height(4.dp))
			Text(
				fontSize = 14.sp,
				text = note.content,
				style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Normal)
			)
		}
	}
}

@Preview
@Composable
fun NoteItemPreview() {
	NoteCard(
		Note(
			title = "Lorem Ipsum",
			createdAt = Date(),
			id = 1,
			content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a rutrum turpis, vel sagittis risus. Vestibulum sit amet enim ante. Vivamus volutpat diam felis, eu fermentum leo congue ut. Mauris eu enim vehicula, hendrerit magna id, convallis risus. Phasellus consectetur varius fringilla. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer consequat elementum risus. Proin interdum condimentum enim, et facilisis est feugiat id. Donec eu ultricies ipsum. Nulla nec nisl at urna iaculis ultricies. Sed a eros at libero euismod viverra nec eget neque. Phasellus gravida erat nec ultrices rutrum. Donec vitae tincidunt felis. Aliquam sodales justo sed felis dapibus, ut maximus turpis fermentum. "
		)
	)
}