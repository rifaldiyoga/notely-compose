package com.tes.notely.domain.models

import java.util.Date

data class Note(
	val id: Int,
	val title: String,
	val content: String,
	val createdAt: Date,
)
