package com.example.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.widget.AppCompatSpinner


class MainActivity : AppCompatActivity() {

    private lateinit var spinner: AppCompatSpinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = listOf<String>("+234","+31", "+233","+245")


        findViewById<Spinner>(R.id.spin_num).adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinner)







    }
}

//class ActivityMainBinding {
//
//}
