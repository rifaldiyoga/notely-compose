package com.tes.notely.presentations.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.tes.notely.domain.usecases.note.GetNotes
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
	private val getNotes: GetNotes
) : ViewModel() {

	var state = mutableStateOf(HomeState())
		private set

	val notes = getNotes().cachedIn(viewModelScope)

	
}