package uz.example.mynote.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.save_item_layout.view.*
import uz.example.mynote.R
import uz.example.mynote.models.SaveModel

class SaveAdapter(val items: List<SaveModel>): RecyclerView.Adapter<SaveAdapter.ViewHolder>() {
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.save_item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = items.get(position)
        holder.itemView.save_data_id.text = item.data
        holder.itemView.save_image_id.setImageResource(item.image)
        holder.itemView.save_text_id.text = item.text
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}