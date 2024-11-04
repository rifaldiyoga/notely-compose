package com.tes.notely.domain.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
@Entity
data class Note(
	@PrimaryKey val id: Int,
	val title: String,
	val content: String,
	val createdAt: Date,
) : Parcelable
