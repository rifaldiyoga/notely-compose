package com.tes.notely.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.tes.notely.domain.models.Note

@Dao
interface NoteDao {

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	suspend fun insert(note: Note)

	@Delete
	suspend fun delete(note: Note)

	@Query("SELECT * FROM note")
	fun getNotes(): PagingSource<Int, Note>


}