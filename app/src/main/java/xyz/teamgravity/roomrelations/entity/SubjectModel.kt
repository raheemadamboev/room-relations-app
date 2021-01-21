package xyz.teamgravity.roomrelations.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.teamgravity.roomrelations.DatabaseConstants

@Entity(tableName = DatabaseConstants.SUBJECT_TABLE)
data class SubjectModel(

    @PrimaryKey(autoGenerate = false)
    val subjectName: String
)
