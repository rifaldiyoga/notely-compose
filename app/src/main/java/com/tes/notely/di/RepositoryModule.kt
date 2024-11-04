package com.tes.notely.di

import com.tes.notely.data.local.NotelyDatabase
import com.tes.notely.data.repositories.NoteRepositoryImpl
import com.tes.notely.domain.repositories.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

	@Provides
	@Singleton
	fun provideNoteRepository(db: NotelyDatabase): NoteRepository {
		return NoteRepositoryImpl(db.noteDao)
	}


}