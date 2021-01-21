package xyz.teamgravity.roomrelations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class SubjectWithStudents(

    @Embedded val subject: SubjectModel,

    @Relation(parentColumn = "subjectName", entityColumn = "studentName", associateBy = Junction(StudentSubjectCrossRef::class))
    val students: List<StudentModel>
)
