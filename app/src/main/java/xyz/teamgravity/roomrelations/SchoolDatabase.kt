package xyz.teamgravity.roomrelations

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import xyz.teamgravity.roomrelations.dao.DirectorDao
import xyz.teamgravity.roomrelations.dao.SchoolDao
import xyz.teamgravity.roomrelations.dao.StudentDao
import xyz.teamgravity.roomrelations.dao.SubjectDao
import xyz.teamgravity.roomrelations.entity.*

@Database(
    entities = [SchoolModel::class, StudentModel::class, DirectorModel::class, SubjectModel::class, StudentSubjectCrossRef::class],
    version = DatabaseConstants.DATABASE_VERSION
)
abstract class SchoolDatabase : RoomDatabase() {

    abstract fun directorDao(): DirectorDao

    abstract fun schoolDao(): SchoolDao

    abstract fun studentDao(): StudentDao

    abstract fun subjectDao(): SubjectDao


    companion object {
        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDatabase::class.java,
                    DatabaseConstants.DATABASE_NAME
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}