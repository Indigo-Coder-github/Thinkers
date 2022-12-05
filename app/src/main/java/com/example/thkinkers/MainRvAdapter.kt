package com.example.thkinkers

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainRvAdapter(val context: Context, val topeventList, ArrayList<TopEvent>) :
RecyclerView.Adapter<TopEvent>() {

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        val eventPhoto = itemView?.findViewById<ImageView>(R.id.topevent_backimg)
        val urllink = itemView?.findViewById<TextView>(R.id.)
    }
}