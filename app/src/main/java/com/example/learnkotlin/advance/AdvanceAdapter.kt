package com.example.learnkotlin.advance

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.R

class AdvanceAdapter(var chapter: List<String>) : RecyclerView.Adapter<AdvanceAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.basic_cardview, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.chapterTitle.text = chapter[position]


    }

    override fun getItemCount(): Int {
        return chapter.size
    }

    fun setAdvanceData(chapterlist: List<String>) {
this.chapter = chapterlist
    }

    class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        var chapterTitle = itemview.findViewById<TextView>(R.id.basic_textview)


    }

}







