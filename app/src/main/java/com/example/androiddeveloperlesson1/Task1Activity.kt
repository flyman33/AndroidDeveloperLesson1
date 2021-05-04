package com.example.androiddeveloperlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

//1. Create a new project in Android Studio.
//2. Change the "Hello World" greeting to "Happy Birthday to " and the name of someone with a recent birthday.
//3. (Optional) Take a screenshot of your finished app and email it to someone whose birthday you forgot.
//4. A common use of the Log class is to log Java exceptions when they occur in your program. There are
//some useful methods, such as Log.e(), that you can use for this purpose. Explore methods you can use
//to include an exception with a Log message. Then, write code in your app to trigger and log an exception.

class Task1Activity : AppCompatActivity() {
    val LOG_TAG = Task1Activity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)
    }

    fun generateException(view: View) {
        try {
            throw Exception("Hi There!")
        } catch (e: java.lang.Exception) {
            Log.e(LOG_TAG, "Exception thrown", e)
            var text = findViewById<TextView>(R.id.output)
            text.setText(getString(R.string.success_output))
        }
    }
}