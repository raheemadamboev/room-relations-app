package xyz.teamgravity.roomrelations

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = DatabaseConstants.SCHOOL_TABLE)
data class SchoolModel(

    @PrimaryKey(autoGenerate = false)
    val schoolName: String
)