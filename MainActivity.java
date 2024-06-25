package com.example.winestoreapp2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView wineRecyclerView;
    private WineAdapter wineAdapter;
    private List<Wine> wineList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wineRecyclerView = findViewById(R.id.wineRecyclerView);
        wineRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        wineList = new ArrayList<>();
        wineList.add(new Wine("Red Wine", "A fine red wine.", 19.99, "https://example.com/red_wine.jpg"));
        wineList.add(new Wine("White Wine", "A crisp white wine.", 15.99, "https://example.com/white_wine.jpg"));
        wineList.add(new Wine("Rose Wine", "A refreshing rose wine.", 12.99, "https://example.com/rose_wine.jpg"));

        wineAdapter = new WineAdapter(this, wineList);
        wineRecyclerView.setAdapter(wineAdapter);
    }
}
