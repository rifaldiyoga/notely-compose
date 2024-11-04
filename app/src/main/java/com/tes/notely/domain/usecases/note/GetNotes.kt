package com.tes.notely.domain.usecases.note

import com.tes.notely.domain.repositories.NoteRepository
import javax.inject.Inject

class GetNotes @Inject constructor(
	private val noteRepository: NoteRepository
) {

	operator fun invoke() = noteRepository.getNotes()

}