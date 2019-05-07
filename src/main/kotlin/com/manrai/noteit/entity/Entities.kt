package com.manrai.noteit.entity

import org.springframework.data.jpa.domain.AbstractPersistable
import javax.persistence.Entity

@Entity
class Note(val title: String, val text: String) : AbstractPersistable<Long>()

@Entity
class Notebook(val name: String) : AbstractPersistable<Long>()

