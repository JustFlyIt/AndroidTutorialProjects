package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String programmingLanguages[];
    String descriptions[];

    int images[] = {R.drawable.css3, R.drawable.html5, R.drawable.ts, R.drawable.java, R.drawable.javascript,
            R.drawable.python, R.drawable.ssh, R.drawable.swift, R.drawable.ts, R.drawable.typescript, R.drawable.visualstudio};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        programmingLanguages = getResources().getStringArray(R.array.programming_languages);
        descriptions = getResources().getStringArray(R.array.descriptions);

        DemoRecyclerViewAdapter demoRecyclerViewAdapter = new DemoRecyclerViewAdapter(this, programmingLanguages, descriptions, images);

        recyclerView.setAdapter(demoRecyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}