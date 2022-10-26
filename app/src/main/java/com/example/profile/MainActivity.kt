package com.example.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatSpinner


class MainActivity : AppCompatActivity() {

    private lateinit var spinner: AppCompatSpinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spin_num)
        val listOfCountries = listOf<Number>(+234,+31, +233,+245, +1,+2,+34)
//        binding = ActivityMainBinding.inflater(layoutInflater)
//        setContentView(binding.root)






    }
}

//class ActivityMainBinding {
//
//}
