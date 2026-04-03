package com.example.sparkup

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->

            val timeInput = findViewById<EditText>(R.id.timeInput)
            val resultText = findViewById<TextView>(R.id.resultText)
            val suggestButton = findViewById<Button>(R.id.buttonspark)
            val resetButton = findViewById<Button>(R.id.resetButton)

            suggestButton.setOnLongClickListener {

                val  time = timeInput.text.toString().lowercase()

                if (time.isEmpty()) {

                    Toast.makeText(context= this, text= "Time of the day?", Toast.LENGTH_LONG).show()
                } else if (time == "morning") {

                    resultText.text =
                        "Send a 'Good morning' text to a family member"

                } else if (time == "mid-morning") {

                    resultText.text =
                        "Reach out to a collegue with a quick 'Thank you.'"

                } else if (time == "afternoon") {

                    resultText.text =
                        "Share a funny meme or interesting link with a friend."

                } else if (time == "afternoon snack time") {

                    resultText.text =
                        "Send a quick 'Thinking of you' message."

                } else if (time == "dinner") {

                    resultText.text =
                        "Call a friend or relative for a 5-minute catch-up."

                } else if (time == "night" || time == "after dinner") {

                    resultText.text =
                        "Leave a thoughtful comment on a friend's post."

                } else {

                    resultText.text =
                        "Invalid input. Try Morning, Afternoon, Dinner, or Night."
                }
            }

            resetButton.setOnClickListener {

                timeInput.text.clear()
                resultText.text = ""
            }

        }
    }
}