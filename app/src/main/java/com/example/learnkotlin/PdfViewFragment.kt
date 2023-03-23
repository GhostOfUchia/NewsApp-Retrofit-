package com.example.learnkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

import androidx.navigation.fragment.NavHostFragment

import com.github.barteksc.pdfviewer.PDFView
import com.google.android.material.bottomnavigation.BottomNavigationView






class PdfViewFragment: NavHostFragment() {
    private var pdfName: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arguments?.let {
             pdfName = it.getString("pdfName")
        }

        val activity = requireActivity()
        if (activity is AppCompatActivity) {
            val bottomNavigationView =
                activity.findViewById<BottomNavigationView>(R.id.bottom_navigation)
            bottomNavigationView.visibility = View.GONE

        }

        val view = inflater.inflate(R.layout.fragment_pdf, container, false)
        val pdfView = view.findViewById<PDFView>(R.id.pdf_view)

        pdfView.fromAsset(pdfName).load()


        return view
    }
}



