package com.tes.notely.presentations.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tes.notely.domain.models.Note
import com.tes.notely.presentations.home.component.NotesList
import java.util.Date

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
	Scaffold(
		modifier = Modifier.fillMaxSize(),
		topBar = {
			CenterAlignedTopAppBar(
				title = {
					Text(
						text = "All Notes",
						fontSize = 16.sp,
						style = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.ExtraBold)
					)
				},
				colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = MaterialTheme.colorScheme.background)
			)
		},
	) { padding ->
		NotesList(modifier = Modifier.padding(padding), noteList = dummyNotes) {
		}
	}
}

@Preview
@Composable
fun HomeScreenPreview() {
	HomeScreen()
}

val dummyNotes = listOf(
	Note(1, "Grocery List", "Milk, Eggs, Bread, Cheese, Yogurt, Cereal, Fruit, Vegetables", Date()),
	Note(
		2,
		"Meeting Notes",
		"Discuss project progress, review deliverables, assign tasks, set deadlines, identify risks",
		Date()
	),
	Note(
		3,
		"Travel Plans",
		"Bookflights to Paris, reserve hotel accommodations, plan itinerary, research attractions, pack luggage",
		Date()
	),
	Note(
		4,
		"Reminders",
		"Pay bills by the due date, schedule a doctor's appointment, pick up dry cleaning, renew library books",
		Date()
	),
	Note(
		5,
		"Ideas",
		"Develop a new mobile app concept, brainstorm blog post topics, explore potential business ventures, learn a new skill",
		Date()
	),
	Note(
		6,
		"Project Proposal",
		"Outline project goals, define scope of work, estimate budget and timeline, identify key stakeholders, present a compelling case",
		Date()
	),
	Note(
		7,
		"Research Notes",
		"Gather data on market trends, analyze competitor strategies, conduct user surveys, compile findings, draw conclusions",
		Date()
	),
	Note(
		8,
		"Personal Journal",
		"Reflect on daily experiences, record thoughts and feelings, track personal growth, set goals for the future",
		Date()
	),
	Note(
		9,
		"Creative Writing",
		"Write a short story, compose a poem, draft a screenplay, develop a novel outline, experiment with different writing styles",
		Date()
	),
	Note(
		10,
		"To-Do List",
		"Complete pending tasks, prioritize urgent items, delegate responsibilities, track progress, celebrate accomplishments",
		Date()
	)
)