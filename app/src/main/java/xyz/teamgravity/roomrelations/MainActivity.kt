package xyz.teamgravity.roomrelations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import xyz.teamgravity.roomrelations.databinding.ActivityMainBinding
import xyz.teamgravity.roomrelations.entity.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val schoolDao = SchoolDatabase.getInstance(this).schoolDao()
        val directorDao = SchoolDatabase.getInstance(this).directorDao()
        val studentDao = SchoolDatabase.getInstance(this).studentDao()
        val subjectDao = SchoolDatabase.getInstance(this).subjectDao()

        // plain data
        val directors = listOf(
            DirectorModel("Mike Litoris", "Jake Wharton School"),
            DirectorModel("Jack Goff", "Kotlin School"),
            DirectorModel("Chris P. Chicken", "JetBrains School")
        )
        val schools = listOf(
            SchoolModel("Jake Wharton School"),
            SchoolModel("Kotlin School"),
            SchoolModel("JetBrains School")
        )
        val subjects = listOf(
            SubjectModel("Dating for programmers"),
            SubjectModel("Avoiding depression"),
            SubjectModel("Bug Fix Meditation"),
            SubjectModel("Logcat for Newbies"),
            SubjectModel("How to use Google")
        )
        val students = listOf(
            StudentModel("Beff Jezos", 2, "Kotlin School"),
            StudentModel("Mark Suckerberg", 5, "Jake Wharton School"),
            StudentModel("Gill Bates", 8, "Kotlin School"),
            StudentModel("Donny Jepp", 1, "Kotlin School"),
            StudentModel("Hom Tanks", 2, "JetBrains School")
        )
        val studentSubjectRelations = listOf(
            StudentSubjectCrossRef("Beff Jezos", "Dating for programmers"),
            StudentSubjectCrossRef("Beff Jezos", "Avoiding depression"),
            StudentSubjectCrossRef("Beff Jezos", "Bug Fix Meditation"),
            StudentSubjectCrossRef("Beff Jezos", "Logcat for Newbies"),
            StudentSubjectCrossRef("Mark Suckerberg", "Dating for programmers"),
            StudentSubjectCrossRef("Gill Bates", "How to use Google"),
            StudentSubjectCrossRef("Donny Jepp", "Logcat for Newbies"),
            StudentSubjectCrossRef("Hom Tanks", "Avoiding depression"),
            StudentSubjectCrossRef("Hom Tanks", "Dating for programmers")
        )

        // insert
        lifecycleScope.launch {
            directors.forEach { directorDao.insert(it) }
            schools.forEach { schoolDao.insert(it) }
            subjects.forEach { subjectDao.insert(it) }
            students.forEach { studentDao.insert(it) }
            studentSubjectRelations.forEach { studentDao.insertSubjectCrossRef(it) }

            val schoolWithDirector = schoolDao.getSchoolDirector("Kotlin School")

            val schoolWithStudents = schoolDao.getSchoolWithStudents("Kotlin School")
        }
    }
}