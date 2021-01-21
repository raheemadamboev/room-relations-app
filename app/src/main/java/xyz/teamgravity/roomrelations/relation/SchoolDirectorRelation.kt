package xyz.teamgravity.roomrelations.relation

import androidx.room.Embedded
import androidx.room.Relation
import xyz.teamgravity.roomrelations.entity.DirectorModel
import xyz.teamgravity.roomrelations.entity.SchoolModel

data class SchoolDirectorRelation(

    @Embedded
    val school: SchoolModel,

    @Relation(parentColumn = "schoolName", entityColumn = "schoolName")
    val director: DirectorModel
)