package com.example.learnkotlin.basic


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.R

import com.example.learnkotlin.modle.MyViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView


class BasicFragment : Fragment(), BasicAdapter.OnItemClick {
    private lateinit var viewModel: MyViewModel
    private lateinit var adapter: BasicAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val activity = requireActivity()
        if (activity is AppCompatActivity) {
            val bottomNavigationView =
                activity.findViewById<BottomNavigationView>(R.id.bottom_navigation)
            bottomNavigationView.visibility = View.VISIBLE

        }

        val view = inflater.inflate(R.layout.fragment_basic, container, false)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        recyclerView = view.findViewById<RecyclerView>(R.id.chapter_basic)

        adapter = BasicAdapter(listOf<String>(), listener = this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        viewModel.getBasicChapterList()
        viewModel.basicData.observe(this.viewLifecycleOwner, Observer {
            adapter.setBasicData(it as List<String>)
        })

        return view
    }

    override fun onClick(position: Int, activity: AppCompatActivity) {
        viewModel.loadPdf(position, activity)

    }

}

