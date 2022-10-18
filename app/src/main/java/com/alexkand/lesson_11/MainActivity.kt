package com.alexkand.lesson_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listOfKats = listOf(R.drawable.kat, R.drawable.katOne)
    val listOfDogs= listOf(R.drawable.dog, R.drawable.dogOne)
    val listOfHorsess= listOf(R.drawable.horse, R.drawable.horseOne)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_search_thing.setOnClickListener {
            val currentText = et_search_thing.text.toString()
            when (currentText) {
                "Cat" -> iv_thing.setImageResource(listOfKats.random())
                "Dog" -> iv_thing.setImageResource(listOfDogs.random())
                "Horse" -> iv_thing.setImageResource(listOfHorsess.random())
                "Cats" -> iv_thing.setImageResource(listOfKats.random())
                "Dogs" -> iv_thing.setImageResource(listOfDogs.random())
                "Horses" -> iv_thing.setImageResource(listOfHorsess.random())
            }

        }
    }
}

