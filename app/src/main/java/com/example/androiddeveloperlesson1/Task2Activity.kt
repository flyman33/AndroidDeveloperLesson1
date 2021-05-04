package com.example.androiddeveloperlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//1. Create a new Android project from the Empty Template.
//2. Add logging statements for various log levels in onCreate() in the main activity.
//3. Create an emulator for a device, targeting any version of Android you like, and run the app.
//4. Use filtering in Logcat to find your log statements and adjust the levels to only display debug or error logging statements.

class Task2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)
        Log.e("Task2Activity", "Error log")
        Log.w("Task2Activity", "Warn log")
        Log.i("Task2Activity", "Info log")
    }
}