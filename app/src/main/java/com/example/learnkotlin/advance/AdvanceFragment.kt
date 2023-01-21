package com.example.learnkotlin.advance

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.R
import com.example.learnkotlin.modle.MyViewModle

class AdvanceFragment : Fragment() {
    private lateinit var viewModel: MyViewModle
    private lateinit var adapter: AdvanceAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(container?.context).inflate(
            R.layout.fragment_advance, container, false
        )
        viewModel = ViewModelProvider(this).get(MyViewModle::class.java)
        val recyclerlist = view.findViewById<RecyclerView>(R.id.chapter_advance)

        adapter = AdvanceAdapter(listOf<String>())
        recyclerlist.adapter = adapter
        recyclerlist.layoutManager = LinearLayoutManager(context)
        viewModel.getAdvanceChapterList()
        viewModel.advanceData.observe(viewLifecycleOwner, Observer {
            adapter.setAdvanceData(it as List<String>)
        })
        return view
    }
}