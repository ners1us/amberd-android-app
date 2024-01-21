package com.example.amberd.Activities

import com.example.amberd.R

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val title: TextView = findViewById(R.id.itemList_title_one)
        val text: TextView = findViewById(R.id.itemList_desc_text)

        title.text = intent.getStringExtra("itemTitle")
        text.text = intent.getStringExtra("itemDesc")
    }
}
