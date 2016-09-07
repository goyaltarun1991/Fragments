package com.example.c_tgoyal.fragments;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String top,String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener)activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment,container,false);

        topTextInput = (EditText) view.findViewById(R.id.top_fragment);
        bottomTextInput = (EditText) view.findViewById(R.id.bottom_fragment);

        Button button = (Button) view.findViewById(R.id.button);
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                buttonClicked(v);
                return true;

            }
        });

        return view;
    }

    public void buttonClicked(View view)
    {
          activityCommander.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
