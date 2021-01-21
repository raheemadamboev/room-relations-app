package xyz.teamgravity.roomrelations.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.teamgravity.roomrelations.DatabaseConstants

@Entity(tableName = DatabaseConstants.SCHOOL_TABLE)
data class SchoolModel(

    @PrimaryKey(autoGenerate = false)
    val schoolName: String
)