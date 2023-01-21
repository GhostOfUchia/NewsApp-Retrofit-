package com.example.learnkotlin.modle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learnkotlin.advance.AdvanceChapterRepositry
import com.example.learnkotlin.basic.BasicChapterRepositery
import kotlinx.coroutines.launch

class MyViewModle : ViewModel() {
    val basicData:MutableLiveData<List<String>> = MutableLiveData()
  val advanceData:MutableLiveData<List<String>> = MutableLiveData()
     fun getBasicChapterList(){
         viewModelScope.launch{
         val chapterList =  BasicChapterRepositery.getBasicChapter()
         basicData.value = chapterList
     }
     }


    fun getAdvanceChapterList() {
        viewModelScope.launch {
            val chapterList = AdvanceChapterRepositry.getAdvanceChapter()
            advanceData.value = chapterList
        }
    }




}