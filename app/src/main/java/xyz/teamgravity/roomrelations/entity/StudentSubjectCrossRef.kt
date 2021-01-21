package xyz.teamgravity.roomrelations.entity

import androidx.room.Entity
import xyz.teamgravity.roomrelations.DatabaseConstants

@Entity(tableName = DatabaseConstants.STUDENT_SUBJECT_CROSS_REF_TABLE, primaryKeys = ["studentName", "subjectName"])
data class StudentSubjectCrossRef(

    val studentName: String,

    val subjectName: String
)
