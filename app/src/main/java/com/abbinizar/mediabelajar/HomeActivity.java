package com.abbinizar.mediabelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void profil(View view) {
        Intent profil = new Intent(HomeActivity.this, ProfilActivity.class);
        startActivity(profil);
    }

    public void kuis(View view) {
        Intent kuis = new Intent(HomeActivity.this, KuisActivity.class);
        startActivity(kuis);
    }

    public void essay(View view) {
        Intent essay = new Intent(HomeActivity.this, EssayActivity.class);
        startActivity(essay);
    }

    public void materi(View view) {
        Intent materi = new Intent(HomeActivity.this, detailMateri.class);
        startActivity(materi);
    }
}
