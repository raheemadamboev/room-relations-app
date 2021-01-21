package xyz.teamgravity.roomrelations.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import xyz.teamgravity.roomrelations.entity.DirectorModel

@Dao
interface DirectorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(director: DirectorModel)
}