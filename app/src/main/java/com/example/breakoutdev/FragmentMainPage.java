package com.example.breakoutdev;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FragmentMainPage extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View main_fragment = inflater.inflate(R.layout.fragment_bottom_tab_main, null);
        Button startSession = main_fragment.findViewById(R.id.start_session);
        startSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent new_meeting = new Intent(getActivity(), NewMeetingActivity.class);
                startActivity(new_meeting);
            }
        });
        return main_fragment;
    }
}
