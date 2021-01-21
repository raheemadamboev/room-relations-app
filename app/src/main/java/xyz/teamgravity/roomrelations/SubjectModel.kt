package xyz.teamgravity.roomrelations

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = DatabaseConstants.SUBJECT_TABLE)
data class SubjectModel(

    @PrimaryKey(autoGenerate = false)
    val subjectName: String
)
