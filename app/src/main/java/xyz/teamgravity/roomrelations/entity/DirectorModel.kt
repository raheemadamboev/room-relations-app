package xyz.teamgravity.roomrelations.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.teamgravity.roomrelations.DatabaseConstants

@Entity(tableName = DatabaseConstants.DIRECTOR_TABLE)
data class DirectorModel(

    @PrimaryKey(autoGenerate = false)
    val directorName: String,

    val schoolName: String
)
