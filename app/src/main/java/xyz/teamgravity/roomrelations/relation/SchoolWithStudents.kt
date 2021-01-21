package xyz.teamgravity.roomrelations.relation

import androidx.room.Embedded
import androidx.room.Relation
import xyz.teamgravity.roomrelations.entity.SchoolModel
import xyz.teamgravity.roomrelations.entity.StudentModel

data class SchoolWithStudents(

    @Embedded val school: SchoolModel,

    @Relation(parentColumn = "schoolName", entityColumn = "schoolName")
    val students: List<StudentModel>
)