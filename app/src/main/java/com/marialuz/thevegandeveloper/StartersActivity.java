package com.marialuz.thevegandeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);
        String[] dishes = {
                "Nori and chickpea soup",
                "Mustard and artichoke soup",
                "Leek and swede soup",
                "Aubergine and cardamom gyoza",
                "Squash and celeriac gyoza",
                "Tofu and parsley dumplings",
                "Horseradish and vegan pesto parcels",
                "Strawberry and peppercorn soup",
                "Mushroom and sweetcorn wontons",
                "Aubergine and tofu dumplings",
                "Mango and buckwheat vegan crepes",
                "Onion and black pepper panini",
                "Celeriac and garam masala parcels",
                "Watermelon and horseradish sushi",
                "Sun-dried Tomato Focaccia with Arugula Pesto"
        };

        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}