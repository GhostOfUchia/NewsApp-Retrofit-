package com.example.learnkotlin.basic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.R
import com.example.learnkotlin.fragment.pdfViewFragment

class BasicAdapter(private var chapterList: List<String> ) : RecyclerView.Adapter<BasicAdapter.Viewholder2>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder2 {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.basic_cardview, parent, false)
        return Viewholder2(view)
    }
    override fun onBindViewHolder(holder: Viewholder2, position: Int) {
        val num = position
        holder.basicChapterTitle.text = chapterList[num]

        holder.itemView.setOnClickListener {
            when (num) {
                0 -> {
                        val activity = it!!.context as AppCompatActivity
                        val pdfviewFragment = pdfViewFragment("variable1.pdf")
                        activity.supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, pdfviewFragment)
                            .addToBackStack(null).commit()

                }
                1 -> {
                    val activity = it!!.context as AppCompatActivity
                    val pdfviewFragment = pdfViewFragment("data-type.pdf")
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, pdfviewFragment)
                        .addToBackStack(null).commit()
                }
                2 -> {
                    val activity = it!!.context as AppCompatActivity
                    val pdfviewFragment = pdfViewFragment("type-conversion.pdf")
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, pdfviewFragment)
                        .addToBackStack(null).commit()

                }

            }
        }
    }
    fun setBasicData(chapterlist:List<String>){
this.chapterList = chapterlist
    }

    override fun getItemCount(): Int {
        return chapterList.size
    }

    class Viewholder2(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val basicChapterTitle = itemView.findViewById<TextView>(R.id.basic_textview)!!
    }

}


