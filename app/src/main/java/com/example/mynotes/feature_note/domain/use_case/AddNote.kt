package com.example.mynotes.feature_note.domain.use_case

import com.example.mynotes.feature_note.domain.model.Note
import com.example.mynotes.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(Note.InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw Note.InvalidNoteException("Note of title can't be blank")
        }
        if (note.content.isBlank()) {
            throw Note.InvalidNoteException("Note of content can't be blank")
        }
        repository.insertNote(note)
    }
}