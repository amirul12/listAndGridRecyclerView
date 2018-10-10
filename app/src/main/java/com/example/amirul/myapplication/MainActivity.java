package com.example.amirul.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final int GRID = 0;
    final int LIST = 1;
    int type;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager gridLayoutManager, linearLayoutManager;
    MyAdapter adapter;

    Button btnChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Display contents in views
        final List<Person> list = new ArrayList<>();
        list.add(new Person("Ariq Row 1"));
        list.add(new Person("Ariq Row 2"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));
        list.add(new Person("Ariq Row 3"));


        // Finding views by id
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        btnChange = (Button) findViewById(R.id.btnChange);

        // Defining Linear Layout Manager
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        // Defining Linear Layout Manager (here, 3 column span count)
        gridLayoutManager = new GridAutoFitLayoutManager(getApplicationContext(), 100);
       // gridLayoutManager = new GridLayoutManager(getApplicationContext(), 3);


        //Setting gird view as default view
        type = GRID;
        adapter = new MyAdapter(list, GRID);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);



        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (type == LIST)
                {
                    // Change to grid view
                    adapter = new MyAdapter(list, GRID);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    recyclerView.setAdapter(adapter);
                    type = GRID;
                }

                else
                {
                    // Change to list view
                    adapter = new MyAdapter(list, LIST);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(adapter);
                    type = LIST;
                }
            }
        });



    }
}
