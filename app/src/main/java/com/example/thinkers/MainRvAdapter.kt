package com.example.thinkers

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainRvAdapter(val context: Context, val topeventList: ArrayList<TopEvent>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val eventPhoto: ImageView = itemView.findViewById(R.id.topevent_backimg)
        val urllink: TextView = itemView.findViewById(R.id.topevent_backimg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}