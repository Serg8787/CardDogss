package com.example.carddogs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_detail.view.*
import kotlinx.android.synthetic.main.item_dog.view.*

class DogAdapter(val context:Context?,val dogsList:ArrayList<Dog>,val callback: DogsListCallback):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_dog,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.avatar.setImageBitmap(dogsList[position].avatar)
        holder.name.text = dogsList[position].name
        holder.specias.text = dogsList[position].specias
        holder.root.setOnClickListener { callback.onItemClickListener(position) }
    }

    override fun getItemCount():Int = dogsList.size
}
class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val avatar = itemView.ivAvatarItem
    val name = itemView.tvNameItem
    val specias = itemView.tvSpeciasItem
    val root = itemView.constRootItem
}
interface DogsListCallback{
    fun onItemClickListener(index :Int)
}