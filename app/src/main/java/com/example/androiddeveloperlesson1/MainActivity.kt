package com.example.androiddeveloperlesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goingToLesson1Part1CodingChallenge(view: View) {
        val intent = Intent(this, Task1Activity::class.java)
        startActivity(intent)
    }


    fun goingToLesson1Part1Homework(view: View) {
        val intent = Intent(this, Task2Activity::class.java)
        startActivity(intent)
    }

    fun goingToTaskLesson1Part2CodingChallenge(view: View) {
        val intent = Intent(this, Lesson1Part2CodingChallengeActivity::class.java)
        startActivity(intent)
    }

    fun goingToTaskLesson1Part3CodingChallenge(view: View) {
        val intent = Intent(this, Lesson1Part3CodingChallengeActivity::class.java)
        startActivity(intent)
    }
}