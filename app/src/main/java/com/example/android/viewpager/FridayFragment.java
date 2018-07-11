package com.example.android.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FridayFragment extends Fragment {
    private static final String ARG_DAY = "day";
    private int resource;

    public static FridayFragment newInstance(int resource){
        FridayFragment fridayFragment = new FridayFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_DAY, resource);
        fridayFragment.setArguments(args);

        return  fridayFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display_day, container, false);
        if(savedInstanceState == null) {
            resource = getArguments().getInt(ARG_DAY);
        }
        else {
            resource = savedInstanceState.getInt(ARG_DAY);
        }
        TextView dayTextView = (TextView) view.findViewById(R.id.text_day);
        dayTextView.setText(resource);



        return view;
    }
}
