package uz.example.mynote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_save.*
import uz.example.mynote.adapter.SaveAdapter
import uz.example.mynote.models.SaveModel

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)
        save_recycler.layoutManager = LinearLayoutManager(this)
        val list = listOf<SaveModel>(
            SaveModel("15:05", R.drawable.p1, "14:04", "Lorem ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum"),
            SaveModel("15:05", R.drawable.p2, "14:04", "Lorem ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum"),
            SaveModel("15:05", R.drawable.p3, "14:04", "Lorem  ipsum ipsum ipsum ipsum ipsum"),
            SaveModel("15:05", R.drawable.p4, "14:04", "Lorem ipsum"),
            SaveModel("15:05", R.drawable.p5, "14:04", "Lorem ipsum ipsum ipsum"),
            SaveModel("15:05", R.drawable.p6, "14:04", "Lorem ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum")
        )
        save_recycler.adapter = SaveAdapter(list)
        // add coment
    }
}