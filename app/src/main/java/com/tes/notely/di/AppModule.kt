package com.tes.notely.di

import android.app.Application
import androidx.room.Room
import com.tes.notely.data.local.NotelyDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

	@Provides
	@Singleton
	fun provideNotelyDatabase(app: Application): NotelyDatabase {
		return Room.databaseBuilder(
			app,
			NotelyDatabase::class.java,
			NotelyDatabase.DATABASE_NAME
		).build()
	}

	@Provides
	@Singleton
	fun provideNoteDao(db: NotelyDatabase) = db.noteDao

}