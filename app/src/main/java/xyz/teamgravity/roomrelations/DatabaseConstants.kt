package xyz.teamgravity.roomrelations

object DatabaseConstants {

    /**
     * Database name
     */
    const val DATABASE_NAME = "RoomRelationsDatabase"

    /**
     * Database version
     */
    const val DATABASE_VERSION = 1

    /**
     * Director table
     */
    const val DIRECTOR_TABLE = "director_table"

    /**
     * School table
     */
    const val SCHOOL_TABLE = "school_table"

    /**
     * Student table
     */
    const val STUDENT_TABLE = "student_table"

    /**
     * Subject table
     */
    const val SUBJECT_TABLE = "subject_table"

    /**
     * Student subject cross reference table for N-TO-M relationship
     */
    const val STUDENT_SUBJECT_CROSS_REF_TABLE = "student_subject_cross_ref_table"
}