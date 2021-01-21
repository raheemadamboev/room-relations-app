package xyz.teamgravity.roomrelations

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = DatabaseConstants.STUDENT_TABLE)
data class StudentModel(

    @PrimaryKey(autoGenerate = false)
    val studentName: String,

    val semester: Int,

    val schoolName: String
)