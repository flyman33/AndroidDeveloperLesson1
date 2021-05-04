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

    fun goingToTask1(view: View) {
        val intent = Intent(this, Task1Activity::class.java)
        startActivity(intent)
    }


    fun goingToTask2(view: View) {
        val intent = Intent(this, Task2Activity::class.java)
        startActivity(intent)
    }
}