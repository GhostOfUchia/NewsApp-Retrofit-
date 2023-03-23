package com.example.learnkotlin.basic


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.R

class BasicAdapter(private var chapterList: List<String>, val listener: OnItemClick) :
    RecyclerView.Adapter<BasicAdapter.Viewholder2>() {

    fun setBasicData(chapterlist: List<String>) {
        this.chapterList = chapterlist
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder2 {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.basic_cardview, parent, false)
        return Viewholder2(view)
    }

    override fun onBindViewHolder(holder: Viewholder2, position: Int) {

        holder.basicChapterTitle.text = chapterList[position]

        holder.itemView.setOnClickListener {

            listener.onClick(position,it.context as AppCompatActivity )





        }
    }

    override fun getItemCount(): Int {
        return chapterList.size
    }

    inner class Viewholder2(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val basicChapterTitle = itemView.findViewById<TextView>(R.id.basic_textview)!!

    }

    interface OnItemClick {
        fun onClick(position: Int,activity: AppCompatActivity)
    }

}

