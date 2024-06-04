package com.ditooard.mountainindo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ditooard.mountainindo.Gunung
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListGunungAdapter(private val listGunung: ArrayList<Gunung>) : RecyclerView.Adapter<ListGunungAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Gunung)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName:   TextView  = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView  = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_gunung, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val gunung = listGunung[position]

        Glide.with(holder.itemView.context)
            .load(gunung.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text   = gunung.nama
        holder.tvDetail.text = gunung.detail

        holder.itemView.setOnClickListener {

            val intent = Intent(holder.itemView.context, DetailGunungActivity::class.java).apply {
                putExtra(DetailGunungActivity.EXTRA_NAMA,         gunung.nama)
                putExtra(DetailGunungActivity.EXTRA_DETAIL,       gunung.detail)
                putExtra(DetailGunungActivity.EXTRA_IMAGE,        gunung.photo)
                putExtra(DetailGunungActivity.EXTRA_LOKASI,       gunung.lokasi)
                putExtra(DetailGunungActivity.EXTRA_JALUR,        gunung.jalur)
                putExtra(DetailGunungActivity.EXTRA_TINGGI,       gunung.tinggi)

            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listGunung.size
    }
}