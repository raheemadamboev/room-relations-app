package xyz.teamgravity.roomrelations

import androidx.room.Entity

@Entity(tableName = DatabaseConstants.STUDENT_SUBJECT_CROSS_REF_TABLE, primaryKeys = ["studentName", "subjectName"])
data class StudentSubjectCrossRef(

    val studentName: String,

    val subjectName: String
)
