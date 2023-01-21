package com.example.learnkotlin.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.learnkotlin.R
import com.example.learnkotlin.R.*
import com.github.barteksc.pdfviewer.PDFView
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior

class pdfViewFragment(assetName:String) : Fragment() {
    private var name = assetName
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(layout.fragment_pdf_view, container, false)
        val pdfView = view.findViewById<PDFView>(R.id.pdf_view)
        pdfView.fromAsset(this.name).load()
        return view
    }
}

/* @SuppressLint("SuspiciousIndentation")
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)


      }
      */
