package com.example.student.myapplication;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
Button but;
    View rootView;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container,
                false);
        TextView tv = (TextView) rootView.findViewById(R.id.textView);
        tv.setTextColor(Color.rgb(255, 0, 0));
        tv.setText("test");
        but = (Button) rootView.findViewById(R.id.button);
        but.setText("Test");


        // Find the root view


        // Set the color
       rootView.setBackgroundColor(Color.BLACK);
        return rootView;
    }

    public void clickMethod() {
        rootView.setBackgroundColor(Color.rgb(255,0,0));
    }

}
