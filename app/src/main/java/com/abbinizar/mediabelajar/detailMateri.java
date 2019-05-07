package com.abbinizar.mediabelajar;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class detailMateri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_materi);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Termodinamika termodinamika = new Termodinamika();
        fragmentTransaction.add(R.id.frame_fragment, termodinamika);
        fragmentTransaction.addToBackStack("HomeActivity");
        fragmentTransaction.commit();
    }
}
