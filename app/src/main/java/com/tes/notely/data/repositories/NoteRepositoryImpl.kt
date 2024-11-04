package com.tes.notely.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.tes.notely.data.local.dao.NoteDao
import com.tes.notely.domain.models.Note
import com.tes.notely.domain.repositories.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
	private val noteDao: NoteDao
) : NoteRepository {

	override fun getNotes(): Flow<PagingData<Note>> {
		return Pager(
			config = PagingConfig(pageSize = 10),
			pagingSourceFactory = {
				noteDao.getNotes()
			}
		).flow
	}

	override suspend fun addNote(note: Note) {
		noteDao.insert(note)
	}

}