package com.example.quizapp

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()

        val que1=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina" ,
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        val que2=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina" ,
            "Australia",
            "Armenia",
            "Austria",
            2
        )
        val que3=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Fiji" ,
            "Australia",
            "Armenia",
            "Belgium",
            4
        )
        val que4=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belgium" ,
            "Germany",
            "Brazil",
            "Austria",
            3
        )
        val que5=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark" ,
            "Kuwait",
            "New Zealand",
            "India",
            1
        )
        val que6=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Kuwait" ,
            "Fiji",
            "Great Britain",
            "India",
            2
        )
        val que7=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium" ,
            "Australia",
            "Austria",
            "Germany",
            4
        )
        val que8=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina" ,
            "Australia",
            "India",
            "Austria",
            3
        )
        val que9=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait" ,
            "Fiji",
            "Great Britain",
            "India",
            1
        )
        val que10=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia" ,
            "Great Britain",
            "New Zealand",
            "India",
            3
        )

        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)

        return questionList
    }
}