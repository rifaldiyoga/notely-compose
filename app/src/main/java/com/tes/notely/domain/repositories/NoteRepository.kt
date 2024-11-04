package com.tes.notely.domain.repositories

import androidx.paging.PagingData
import com.tes.notely.domain.models.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

	fun getNotes(): Flow<PagingData<Note>>

	suspend fun addNote(note: Note)
}