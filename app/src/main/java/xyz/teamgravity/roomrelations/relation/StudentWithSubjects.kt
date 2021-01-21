package xyz.teamgravity.roomrelations.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import xyz.teamgravity.roomrelations.entity.StudentSubjectCrossRef
import xyz.teamgravity.roomrelations.entity.StudentModel
import xyz.teamgravity.roomrelations.entity.SubjectModel

data class StudentWithSubjects(

    @Embedded val student: StudentModel,

    @Relation(parentColumn = "studentName", entityColumn = "subjectName", associateBy = Junction(StudentSubjectCrossRef::class))
    val subjects: List<SubjectModel>
)
