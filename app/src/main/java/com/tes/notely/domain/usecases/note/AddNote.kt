package com.tes.notely.domain.usecases.note

import com.tes.notely.domain.models.Note
import com.tes.notely.domain.repositories.NoteRepository
import javax.inject.Inject

class AddNote @Inject constructor(
	private val noteRepository: NoteRepository
) {

	suspend operator fun invoke(note: Note) {
		noteRepository.addNote(note = note)
	}

}