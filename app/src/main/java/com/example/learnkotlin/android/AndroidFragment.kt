package com.example.learnkotlin.android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.R
import com.example.learnkotlin.android.AndroidAdapter

class AndroidFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(container?.context).inflate(

            R.layout.fragment_android, container, false
        )

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val androidrecycleView = view.findViewById<RecyclerView>(R.id.android_recyclerview)
        val androidchapter = listOf("Basic","RoomDataBase")

       androidrecycleView.adapter = AndroidAdapter(androidchapter)
      androidrecycleView.layoutManager = LinearLayoutManager(context)
    }
}