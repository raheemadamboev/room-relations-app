package xyz.teamgravity.roomrelations

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface DirectorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(director: DirectorModel)
}