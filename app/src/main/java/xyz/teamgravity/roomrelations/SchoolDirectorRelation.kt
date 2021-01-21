package xyz.teamgravity.roomrelations

import androidx.room.Embedded
import androidx.room.Relation

data class SchoolDirectorRelation(

    @Embedded
    val school: SchoolModel,

    @Relation(parentColumn = "schoolName", entityColumn = "schoolName")
    val director: DirectorModel
)