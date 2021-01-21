package xyz.teamgravity.roomrelations

import androidx.room.*

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