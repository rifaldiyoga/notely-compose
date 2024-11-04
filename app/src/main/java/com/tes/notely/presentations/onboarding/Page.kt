package com.tes.notely.presentations.onboarding

import androidx.annotation.DrawableRes
import com.tes.notely.R

data class Page(
	val title: String = "",
	val description: String = "",
	@DrawableRes val image: Int = 0
)

val pages = listOf(
	Page(
		title = "World’s Safest And Largest Digital Notebook",
		description = "Notely is the world’s safest, largest and intelligent digital notebook. Join over 10M+ users already using Notely.",
		image = R.drawable.img_onboarding1
	),
	Page(
		title = "World’s Safest And Largest Digital Notebook",
		description = "Notely is the world’s safest, largest and intelligent digital notebook. Join over 10M+ users already using Notely.",
		image = R.drawable.img_onboarding1
	),
	Page(
		title = "World’s Safest And Largest Digital Notebook",
		description = "Notely is the world’s safest, largest and intelligent digital notebook. Join over 10M+ users already using Notely.",
		image = R.drawable.img_onboarding1
	),
)
