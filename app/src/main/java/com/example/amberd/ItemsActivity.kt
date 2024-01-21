package com.example.amberd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "wine", "Red Dry Wine","Armenian 15 y.o. wine with a unique taste","", 15000))
        items.add(Item(2, "kabob", "Kabob","A basic kabob with onion rings & herbs on it","", 340))
        items.add(Item(3, "pita", "Pita bread","An armenian pita bread, aka \"Matnakash\"", "", 200))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)


    }

}
