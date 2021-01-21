package xyz.teamgravity.roomrelations.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import xyz.teamgravity.roomrelations.entity.StudentSubjectCrossRef
import xyz.teamgravity.roomrelations.entity.StudentModel
import xyz.teamgravity.roomrelations.entity.SubjectModel

data class SubjectWithStudents(

    @Embedded val subject: SubjectModel,

    @Relation(parentColumn = "subjectName", entityColumn = "studentName", associateBy = Junction(StudentSubjectCrossRef::class))
    val students: List<StudentModel>
)
