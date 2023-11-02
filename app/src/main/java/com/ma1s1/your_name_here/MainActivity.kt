package com.ma1s1.your_name_here

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bioButton = findViewById<Button>(R.id.bioButton)
        var task1Button = findViewById<Button>(R.id.task1Button)


        var value_from_main_activity  = "1234ABC"

        bioButton.setOnClickListener{
            var bioIntent = Intent(this, BioActivity::class.java)
            startActivity(bioIntent)
        }


        task1Button.setOnClickListener{
            var task1intent = Intent(this, Task1Activity::class.java)
            task1intent.putExtra("value_to_send_from_main_activity",value_from_main_activity)
            startActivity(task1intent)
        }
//
//        Button.setOnClickListener{
//            var intent = Intent(this, Activity::class.java)
//            startActivity(intent)
//        }

    }
}