package com.example.composepracticeapp.uilayouts.controlselection

data class CheckInfo(
    val title: String,
    var selected: Boolean = false,
    var onCheckedChange: (Boolean) -> Unit
)
