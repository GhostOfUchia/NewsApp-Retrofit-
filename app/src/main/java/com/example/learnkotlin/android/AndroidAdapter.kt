package com.example.learnkotlin.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.R

class AndroidAdapter(val androidChapter: List<String>) :
    RecyclerView.Adapter<AndroidAdapter.AndroidViewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidViewholder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.basic_cardview, parent, false)
        return AndroidViewholder(view)
    }

    override fun onBindViewHolder(holder: AndroidViewholder, position: Int) {
        holder.androidchaptertitle.text = androidChapter[position]
    }

    override fun getItemCount(): Int {
        return androidChapter.size
    }

    class AndroidViewholder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val androidchaptertitle = itemView.findViewById<TextView>(R.id.basic_textview)
    }
}