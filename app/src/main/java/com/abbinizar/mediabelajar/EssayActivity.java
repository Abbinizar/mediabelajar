package com.abbinizar.mediabelajar;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EssayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PreTest preTest = new PreTest();
        fragmentTransaction.add(R.id.frame_essay, preTest);
        fragmentTransaction.addToBackStack("HomeActivity");
        fragmentTransaction.commit();
    }
}
