package xyz.teamgravity.roomrelations

import androidx.room.Embedded
import androidx.room.Relation

data class SchoolWithStudents(

    @Embedded val school: SchoolModel,

    @Relation(parentColumn = "schoolName", entityColumn = "schoolName")
    val students: List<StudentModel>
)