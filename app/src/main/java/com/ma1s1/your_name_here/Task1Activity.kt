package com.ma1s1.your_name_here

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Task1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)
        var name =  intent.getStringExtra("value_to_send_from_main_activity")


    }
}