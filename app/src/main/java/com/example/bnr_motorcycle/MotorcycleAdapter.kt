import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bnr_motorcycle.Motorcycle
import com.example.bnr_motorcycle.R

class MotorcycleAdapter(private val motorcycles: List<Motorcycle>) :
    RecyclerView.Adapter<MotorcycleAdapter.MotorcycleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotorcycleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_motorcycle, parent, false)
        return MotorcycleViewHolder(view)
    }

    override fun onBindViewHolder(holder: MotorcycleViewHolder, position: Int) {
        val motorcycle = motorcycles[position]
        holder.bind(motorcycle)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("name", motorcycle.name)
            intent.putExtra("imageResId", motorcycle.imageResId)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = motorcycles.size

    class MotorcycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageMotorcycle: ImageView = itemView.findViewById(R.id.imageMotorcycle)
        private val textMotorcycleName: TextView = itemView.findViewById(R.id.textMotorcycleName)

        fun bind(motorcycle: Motorcycle) {
            imageMotorcycle.setImageResource(motorcycle.imageResId)
            textMotorcycleName.text = motorcycle.name
        }
    }
}
