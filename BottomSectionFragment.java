package com.example.c_tgoyal.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomSectionFragment extends Fragment{

    private static TextView topTextView;
    private static TextView bottomTextview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_fragment,container,false);

        topTextView = (TextView) view.findViewById(R.id.toptextView);
        bottomTextview = (TextView) view.findViewById(R.id.bottomtextview);
        return view;
    }

    public void setMemetext(String top, String bottom){
        topTextView.setText(top);
        bottomTextview.setText(bottom);
    }
}
