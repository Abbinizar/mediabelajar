package com.abbinizar.mediabelajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class materiActivity extends AppCompatActivity {
    private RecyclerView rvMatery;
    private ArrayList<Materi> list= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        rvMatery = findViewById(R.id.rvMateri);
        rvMatery.setHasFixedSize(true);

        list.addAll(MateriData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMatery.setLayoutManager(new LinearLayoutManager(this));
        ListMateriAdapter listMateriAdapter = new ListMateriAdapter(this);
        listMateriAdapter.setListMateri(list);
        rvMatery.setAdapter(listMateriAdapter);
    }
}
