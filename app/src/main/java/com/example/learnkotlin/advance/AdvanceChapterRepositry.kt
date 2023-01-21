package com.example.learnkotlin.advance

class AdvanceChapterRepositry {

    companion object{
        fun getAdvanceChapter():List<String> {
            val advanceChapter = listOf<String>(
                "ARRAY","STRING-FUINCTION","EXCEPTION HANDLING","NULL SAFETY","SMART CAST",
                "UNSAFE/SAFE-CAST","ELVIS OPERATOR","CLASS AND OBJECT","NESTED/INNER-CLASS",
                "CONSTRUCTOR","VISIBILITY MODIFIER","INHERTIANCE","ABSTRACT-CLASS",
                "INTERFACE","DATA-CLASS","SEALED-CLASS","EXTENSION-FUNCTION","GENERICES",
                "RANGES","MUTABLE-ARRAY","COLLECTIONS","GETTER AND SETTER","UTILIOTY",
                "LIST-INTERFACE","MUTABLE-LIST","ARRAYLIST:ARRAYLISTOF()",
                "MAP-INTERFACE","HAS MAP","HASMAP:HASMAPOF()","MUTABLEMAP-INTERFACE",
                "SET-INTERFACE","MUTABLESET-INTERFACE","HASSET-CLASS"
            )
            return advanceChapter
        }
    }
}