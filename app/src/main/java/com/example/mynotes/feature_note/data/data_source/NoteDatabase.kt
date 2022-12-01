package com.example.mynotes.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mynotes.feature_note.domain.model.Note

/*
* 1. The class must be annotated with a @Database annotation that includes an entities array that lists all of the data entities associated with the database.
* 2. This class must be an abstract class that extends RoomDatabase
* 3. For each DAO class that is associated with the database, the database class must define an abstract method that has zero arguments and returns an instance of the DAO class.
* */
@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun noteDoa(): NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}