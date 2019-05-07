package com.abbinizar.mediabelajar;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class KuisActivity extends AppCompatActivity {
    AlertDialog.Builder builder;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    public void onRadioButton(View view) {
        Boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.radioButton1:
                if (checked)
                    tampilDialog();
                break;
            case R.id.radioButton2:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton3:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton4:
                if (checked)
                    jawabanSalah();
                break;
        }
    }

    private void tampilDialog() {
        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat !!");
        builder.setMessage("Jawaban kamu benar");
        builder.setPositiveButton("Pembahasan", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent detail = new Intent(KuisActivity.this, detailKuis.class);
                startActivity(detail);
            }
        });
        builder.setNegativeButton("Ulangi", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                radioGroup.clearCheck();
            }
        });
        builder.create().show();
    }

    private void jawabanSalah() {
        Toast.makeText(this, "Jawaban kamu salah", Toast.LENGTH_SHORT).show();
    }
}
