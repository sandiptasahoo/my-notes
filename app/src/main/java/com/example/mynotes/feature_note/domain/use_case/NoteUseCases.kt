package com.example.mynotes.feature_note.domain.use_case

import com.example.mynotes.feature_note.domain.model.Note

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)
