package com.example.autouzupelnianie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autokorekta = findViewById<AutoCompleteTextView>(R.id.InputKraje)
        val kraje = resources.getStringArray(R.array.Kraje)

        val adapter = ArrayAdapter(this,
        android.R.layout.simple_expandable_list_item_1, kraje)
        autokorekta.setAdapter(adapter)
    }
}