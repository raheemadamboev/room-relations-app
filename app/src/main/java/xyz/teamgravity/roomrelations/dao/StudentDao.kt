package xyz.teamgravity.roomrelations.dao

import androidx.room.*
import xyz.teamgravity.roomrelations.DatabaseConstants
import xyz.teamgravity.roomrelations.entity.StudentSubjectCrossRef
import xyz.teamgravity.roomrelations.entity.StudentModel
import xyz.teamgravity.roomrelations.relation.StudentWithSubjects
import xyz.teamgravity.roomrelations.relation.SubjectWithStudents

@Dao
interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(student: StudentModel)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubjectCrossRef(crossRef: StudentSubjectCrossRef)

    @Transaction
    @Query("SELECT * FROM ${DatabaseConstants.STUDENT_TABLE} WHERE studentName = :studentName")
    suspend fun getSubjectsOfStudent(studentName: String): List<StudentWithSubjects>
}