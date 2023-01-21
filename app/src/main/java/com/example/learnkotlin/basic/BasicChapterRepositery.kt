package com.example.learnkotlin.basic

class BasicChapterRepositery {
    companion object {
        fun getBasicChapter():List<String> {
            val basicChapter = listOf<String>(
                "Variable", "DATA-TYPE", "TYPE-CONVERSION", "OPERATOR","INPUT/OUTPUT",
                "COMMENTS","EXPRESSION", "FOR-LOOP","WHILE-LOOP","DO-WHILE-LOOP",
                "FOR-EACH-LOOP","CONTINUE-STRUCTURE","BREAK-STRUCTURE","FUNCTION",
                "RECURSION/TAIL-FUNCTION","DEFAULT-ARGUMENT","NAMED-ARGUMENT","LAMBDAS",
                "HIGHER ORDER-FUNCTION", "INLINE-FUNCTION"
            )
            return basicChapter
        }
    }
}