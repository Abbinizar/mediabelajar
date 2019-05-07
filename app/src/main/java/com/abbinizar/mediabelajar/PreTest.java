package com.abbinizar.mediabelajar;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class PreTest extends Fragment {
    private Button buttonPre;


    public PreTest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pre_test, container, false);
        buttonPre = (Button) view.findViewById(R.id.btn_pretest);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        buttonPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostTest postTest = new PostTest();
                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_essay, postTest)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }
        });
    }
}
