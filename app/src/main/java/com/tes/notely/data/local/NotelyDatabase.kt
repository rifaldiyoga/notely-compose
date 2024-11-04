package com.tes.notely.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.tes.notely.data.local.dao.NoteDao
import com.tes.notely.domain.models.Note

@Database(
	entities = [
		Note::class],
	version = 1
)
@TypeConverters(NoteTypeConverter::class)
abstract class NotelyDatabase : RoomDatabase() {

	abstract val noteDao: NoteDao

	companion object {
		const val DATABASE_NAME = "notelydb"
	}

}