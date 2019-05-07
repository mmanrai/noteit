package com.manrai.noteit.respository

import com.manrai.noteit.entity.Note
import com.manrai.noteit.entity.Notebook
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface NoteRepository : JpaRepository<Note, Long> {
    //fun findAllByNotebook(notebook: Notebook): List<Note>
}

@Repository
interface NoteBookRepository : JpaRepository<Notebook, Long>