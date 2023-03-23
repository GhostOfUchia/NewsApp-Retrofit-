package com.example.learnkotlin.modle


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learnkotlin.PdfViewFragment
import com.example.learnkotlin.R

import com.example.learnkotlin.advance.AdvanceChapterRepositry
import com.example.learnkotlin.basic.BasicChapterRepositery

import kotlinx.coroutines.launch


class MyViewModel : ViewModel() {

    val chapterName: MutableLiveData<String> = MutableLiveData()
    val basicData: MutableLiveData<List<String>> = MutableLiveData()
    val advanceData: MutableLiveData<List<String>> = MutableLiveData()
    val chapterList = BasicChapterRepositery.getChapterName()
    fun getBasicChapterList() {
        viewModelScope.launch {
            val chapterList = BasicChapterRepositery.getBasicChapter()
            basicData.value = chapterList

        }
    }
    fun getAdvanceChapterList() {
        viewModelScope.launch {
            val chapterList = AdvanceChapterRepositry.getAdvanceChapter()
            advanceData.value = chapterList
        }
    }
    fun loadPdf(position: Int, activity: AppCompatActivity) {
        val num = position
        val pdfName = when (num) {
            0 -> chapterList.get(0)
            1 -> chapterList.get(1)
            2 -> chapterList.get(2)
            else -> "variable1.pdf"
        }

        chapterName.value = pdfName

        val bundle = Bundle().apply {
            putString("pdfName", pdfName)
        }
        val fragment = PdfViewFragment().apply {
            arguments = bundle
        }
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment).addToBackStack(null).commit()
    }


}


