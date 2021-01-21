package xyz.teamgravity.roomrelations.dao

import androidx.room.*
import xyz.teamgravity.roomrelations.DatabaseConstants
import xyz.teamgravity.roomrelations.relation.SchoolDirectorRelation
import xyz.teamgravity.roomrelations.entity.SchoolModel
import xyz.teamgravity.roomrelations.relation.SchoolWithStudents

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(school: SchoolModel)

    @Transaction
    @Query("SELECT * FROM ${DatabaseConstants.SCHOOL_TABLE} WHERE schoolName = :schoolName")
    suspend fun getSchoolDirector(schoolName: String): List<SchoolDirectorRelation>

    @Transaction
    @Query("SELECT * FROM ${DatabaseConstants.SCHOOL_TABLE} WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents(schoolName: String): List<SchoolWithStudents>
}