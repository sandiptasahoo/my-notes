package com.example.mynotes.feature_note.domain.repository

import com.example.mynotes.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/*
* Interface because it is good for testing.
* We can create fake version of repository.
* */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}