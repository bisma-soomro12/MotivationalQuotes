package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.motivationalqoutes.R
import model.Model

class ItemAdapter(private val context: Context, private val dataset:List<Model>) :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
        class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
            val textView: TextView = view.findViewById(R.id.item_title)
            val imageView: ImageView= view.findViewById(R.id.image_view)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.data_item, parent, false)

        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.strRId)
        holder.imageView.setImageResource(item.imgSId)
    }

    override fun getItemCount() = dataset.size
}