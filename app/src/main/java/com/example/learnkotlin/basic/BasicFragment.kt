package com.example.learnkotlin.basic


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

class BasicFragment : Fragment() {
private lateinit var viewModel: MyViewModle
private lateinit var adapter: BasicAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_basic, container, false)

        viewModel = ViewModelProvider(this).get(MyViewModle::class.java)
        val recyclerView = view.findViewById<RecyclerView>(R.id.chapter_basic)

        adapter = BasicAdapter(listOf<String>())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        viewModel.getBasicChapterList()
        viewModel.basicData.observe(viewLifecycleOwner, Observer{
            adapter.setBasicData(it as List<String>)
        })
        return view
    }
}



