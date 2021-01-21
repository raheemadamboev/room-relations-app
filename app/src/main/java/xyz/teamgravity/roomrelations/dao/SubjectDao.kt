package xyz.teamgravity.roomrelations.dao

import androidx.room.*
import xyz.teamgravity.roomrelations.DatabaseConstants
import xyz.teamgravity.roomrelations.entity.SubjectModel
import xyz.teamgravity.roomrelations.relation.SubjectWithStudents

@Dao
interface SubjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(subject: SubjectModel)

    @Transaction
    @Query("SELECT * FROM ${DatabaseConstants.SUBJECT_TABLE} WHERE subjectName = :subjectName")
    suspend fun getStudentsOfSubject(subjectName: String): List<SubjectWithStudents>
}