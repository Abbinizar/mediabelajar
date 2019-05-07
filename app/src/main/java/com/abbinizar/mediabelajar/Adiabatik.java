package com.abbinizar.mediabelajar;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Adiabatik extends Fragment {
    private Button buttonAdiabatik;


    public Adiabatik() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adiabatik, container, false);
        buttonAdiabatik = (Button) view.findViewById(R.id.btn_adiabatik);
        buttonAdiabatik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(getActivity(), HomeActivity.class);
                startActivity(home);
            }
        });
        return view;
    }

}
