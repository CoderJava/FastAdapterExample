package com.ysn.fastadapterexample;

import android.os.Bundle;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemAdapter<SimpleItem> itemAdapter = new ItemAdapter<>();
        FastAdapter fastAdapter = FastAdapter.with(itemAdapter);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        List<SimpleItem> simpleItemList = new ArrayList<>();
        simpleItemList.add(new SimpleItem("Yudi", "CoderJava"));
        simpleItemList.add(new SimpleItem("Setiawan", "CoderKotlin"));
        itemAdapter.add(simpleItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(fastAdapter);
    }
}
