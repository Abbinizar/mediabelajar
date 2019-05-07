package com.abbinizar.mediabelajar;


import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Termodinamika extends Fragment {
    private Button buttonTermo;


    public Termodinamika() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_termodinamika, container, false);
        buttonTermo = (Button) view.findViewById(R.id.btn_termo);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        buttonTermo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Isotermal isotermal = new Isotermal();

                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_fragment, isotermal)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }
        });
    }
}
