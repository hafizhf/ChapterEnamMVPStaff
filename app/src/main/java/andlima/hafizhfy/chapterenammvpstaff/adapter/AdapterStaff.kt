package andlima.hafizhfy.chapterenammvpstaff.adapter

import andlima.hafizhfy.chapterenammvpstaff.R
import andlima.hafizhfy.chapterenammvpstaff.model.GetAllStaffResponseItem
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_staff.view.*

class AdapterStaff(
    private var listStaff : List<GetAllStaffResponseItem>,
    private var onClick : (GetAllStaffResponseItem)->Unit
)
    : RecyclerView.Adapter<AdapterStaff.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterStaff.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_staff, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterStaff.ViewHolder, position: Int) {
        holder.itemView.tv_nama_staff.text = listStaff[position].name
        holder.itemView.tv_id_staff.append(listStaff[position].id)
        holder.itemView.tv_email_staff.text = listStaff[position].email

        holder.itemView.item.setOnClickListener {
            onClick(listStaff[position])
        }
    }

    override fun getItemCount(): Int {
        return listStaff.size
    }

}