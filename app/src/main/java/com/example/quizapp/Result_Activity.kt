package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class Result_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName:TextView=findViewById(R.id.tv_name)
        val tvResult:TextView=findViewById(R.id.tv_score)
        val tvFinish:Button=findViewById(R.id.btn_finish)

        tvName.text=intent.getStringExtra(Constants.USER_NAME)

        val totalQuestion=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tvResult.text="Your score is $correctAnswers out of $totalQuestion"

        tvFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}