package com.example.mynotes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mynotes.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id:Int? = null
){
    companion object{
        val noteColors = listOf(
            md_theme_light_primary,
            md_theme_light_primaryContainer,
            md_theme_light_tertiary,
            md_theme_dark_error,
            md_theme_light_error
        )
    }

    class InvalidNoteException(message: String): Exception(message)
}
