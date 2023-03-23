package com.example.learnkotlin.basic


class BasicChapterRepositery {


    companion object {
        fun getBasicChapter(): List<String> {
            return listOf(
                "Variable", "DATA-TYPE", "TYPE-CONVERSION", "OPERATOR", "INPUT/OUTPUT",
                "COMMENTS", "EXPRESSION", "FOR-LOOP", "WHILE-LOOP", "DO-WHILE-LOOP",
                "FOR-EACH-LOOP", "CONTINUE-STRUCTURE", "BREAK-STRUCTURE", "FUNCTION",
                "RECURSION/TAIL-FUNCTION", "DEFAULT-ARGUMENT", "NAMED-ARGUMENT", "LAMBDAS",
                "HIGHER ORDER-FUNCTION", "INLINE-FUNCTION"
            )
        }

        fun getChapterName(): List<String> {
            return listOf("variable1.pdf", "data-type.pdf", "type-conversion.pdf")
        }


    }


}






