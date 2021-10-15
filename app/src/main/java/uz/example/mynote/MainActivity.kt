package uz.example.mynote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import uz.example.mynote.adapter.LessonAdapter
import uz.example.mynote.models.LessonNameModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lesson_recycler.layoutManager = LinearLayoutManager(this)
        val list = listOf<LessonNameModel>(
            LessonNameModel("Fizika"),
            LessonNameModel("MSSA"),
            LessonNameModel("Matem"),
            LessonNameModel("Antropologiya"),
            LessonNameModel("Fizika lab"),
            LessonNameModel("MKG")
        )
        lesson_recycler.adapter = LessonAdapter(list)

    }
}