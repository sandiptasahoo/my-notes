package com.example.mynotes.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mynotes.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/*
* Since getAllNotes() returns Flow, no need to mark it as suspend function as in getNoteById() which
* returns Note directly.
* */
@Dao
interface NoteDao {

    @Query("Select * from Note")
    fun getAllNotes(): Flow<List<Note>>

    @Query("Select * from Note where id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}