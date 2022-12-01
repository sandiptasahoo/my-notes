package com.example.mynotes.feature_note.data.repository

import com.example.mynotes.feature_note.data.data_source.NoteDao
import com.example.mynotes.feature_note.domain.model.Note
import com.example.mynotes.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

/*
* Repository directly accesses the data sources so either database or API.
* The job of repository is to decide which one data source to forward to the use case.
* */
class NoteRepositoryImpl(private val noteDao: NoteDao): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getAllNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}