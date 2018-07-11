/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Fragment that displays "Thursday".
 */
public class ThursdayFragment extends Fragment {
    private static final String ARG_DAY = "day";
    private int resource;

    public static ThursdayFragment newInstance(int resource){
        ThursdayFragment thursdayFragment = new ThursdayFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_DAY, resource);
        thursdayFragment.setArguments(args);

        return  thursdayFragment;
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
