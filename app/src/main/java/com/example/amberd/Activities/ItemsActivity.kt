package com.example.amberd.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.amberd.Models.Item
import com.example.amberd.Adapters.ItemsAdapter
import com.example.amberd.R

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "wine", "Red Dry Wine","Armenian 15 y.o. wine with a unique taste","Introducing our exquisite \"Crimson Elegance\" Armenian red dry wine, a true masterpiece crafted from the sun-kissed vineyards of Armenia's renowned winemaking region. This wine is a testament to centuries of winemaking tradition, skillfully marrying modern techniques with age-old expertise.\n" +
                "\n" +
                "The deep, rich hue of this wine reflects its depth of character and intensity. Pour a glass, and the aromas transport you to the heart of the Armenian highlands – notes of ripe red berries, dried figs, and subtle hints of warm spices dance delicately on the nose, enticing your senses.\n" +
                "\n" +
                "On the palate, \"Crimson Elegance\" unfolds in layers of flavor. Juicy pomegranates and dark cherries take center stage, underlined by a touch of earthiness that is characteristic of the region's unique terroir. The wine's tannins are refined and velvety, providing a smooth mouthfeel that leads to a satisfying, lingering finish.", 15000))

        items.add(Item(2, "kabob", "Kabob","A basic kabob with onion rings & herbs on it","Introducing our delectable armenian kabob, a culinary masterpiece that captures the essence of Armenia's rich gastronomic traditions. Crafted with passion and expertise, our kabobs pay homage to the centuries-old art of grilling, perfected in the heart of Armenia's vibrant culinary landscape.\n" +
                "\n" +
                "Our kabobs start with the finest cuts of succulent meats, carefully selected and marinated with a blend of aromatic herbs and spices. This secret marinade infuses each piece of meat with layers of flavor, creating a harmonious symphony of taste that's impossible to resist.\n" +
                "\n" +
                "As you take your first bite, the grill's smoky kiss becomes apparent – a testament to the authentic grilling techniques that have been passed down for generations. The exterior of the kabob boasts a tantalizing char, while the interior remains juicy and tender, a balance that defines the perfect kabob experience.", 340))

        items.add(Item(3, "pita", "Pita bread","An armenian pita bread, aka \"Matnakash\"", "Introducing our authentic Armenian \"Matnakash\" pita bread – a timeless delight that carries the essence of Armenian culture and culinary heritage right to your table. Handcrafted with care using age-old recipes passed down through generations, Matnakash is more than just bread; it's a culinary experience that connects you to the heart of Armenia.\n" +
                "\n" +
                "Each piece of Matnakash is a work of art, characterized by its distinctive shape and intricately woven design. The name \"Matnakash\" itself translates to \"finger-licking,\" a testament to the irresistible nature of this bread that beckons you to savor every bite.\n" +
                "\n" +
                "Baked to golden perfection, the exterior boasts a delightful crunch while the interior remains tender and soft. As you tear into a piece, the aroma of freshly baked dough fills the air – a comforting invitation to explore its flavors. Matnakash is rich in taste with a subtle hint of sweetness, making it versatile enough to accompany both savory and sweet dishes.", 200))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)


    }

}
