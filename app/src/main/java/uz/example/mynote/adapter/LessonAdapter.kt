package uz.example.mynote.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.lesson_item_layout.view.*
import uz.example.mynote.R
import uz.example.mynote.models.LessonNameModel

class LessonAdapter(val lists: List<LessonNameModel>): RecyclerView.Adapter<LessonAdapter.ViewHolder>() {
    inner class  ViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.lesson_item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = lists.get(position)
        holder.itemView.lesson_name_id.setText(item.name)
    }

    override fun getItemCount(): Int {
        return lists.count()
    }
}