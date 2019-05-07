package com.abbinizar.mediabelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detailKuis extends AppCompatActivity implements View.OnClickListener {
    private Button detailKuis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kuis);
        detailKuis = (Button)findViewById(R.id.btn_detailkuis);
        detailKuis.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent home = new Intent(detailKuis.this, HomeActivity.class);
        startActivity(home);
    }
}
