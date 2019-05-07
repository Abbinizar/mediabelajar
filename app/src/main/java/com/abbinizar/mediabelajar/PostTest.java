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
public class PostTest extends Fragment {
    private Button buttonPost;


    public PostTest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_post_test, container, false);
        buttonPost = (Button) view.findViewById(R.id.btn_posttest);
        buttonPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(getActivity(), HomeActivity.class);
                startActivity(home);
            }
        });
        return view;
    }

}
