package com.vladshurakov.jetnotesapp.feature_notes.domain.repository

import com.vladshurakov.jetnotesapp.feature_notes.domain.models.Folder
import com.vladshurakov.jetnotesapp.feature_notes.domain.models.Note
import kotlinx.coroutines.flow.Flow

interface NotesRepository {
    suspend fun insert(note: Note): Long?
    suspend fun get(id: Long): Note?
    suspend fun delete(note: Note)
    suspend fun moveTo(id: Long, folder: Folder)
    suspend fun updatePinned(id: Long, pinned: Boolean)
    fun getDesc(): Flow<List<Note>>
    fun getAsc(): Flow<List<Note>>
    fun getDesc(query: String): Flow<List<Note>>
    fun getAsc(query: String): Flow<List<Note>>
}