package xyz.teamgravity.roomrelations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class StudentWithSubjects(

    @Embedded val student: StudentModel,

    @Relation(parentColumn = "studentName", entityColumn = "subjectName", associateBy = Junction(StudentSubjectCrossRef::class))
    val subjects: List<SubjectModel>
)
