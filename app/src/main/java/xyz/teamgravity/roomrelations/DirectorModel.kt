package xyz.teamgravity.roomrelations

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = DatabaseConstants.DIRECTOR_TABLE)
data class DirectorModel(

    @PrimaryKey(autoGenerate = false)
    val directorName: String,

    val schoolName: String
)
