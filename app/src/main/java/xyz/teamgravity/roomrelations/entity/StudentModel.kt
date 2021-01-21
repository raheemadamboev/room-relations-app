package xyz.teamgravity.roomrelations.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.teamgravity.roomrelations.DatabaseConstants

@Entity(tableName = DatabaseConstants.STUDENT_TABLE)
data class StudentModel(

    @PrimaryKey(autoGenerate = false)
    val studentName: String,

    val semester: Int,

    val schoolName: String
)