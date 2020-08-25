package com.example.breakoutdev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FragmentCommunityPage extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View community_fragment = inflater.inflate(R.layout.fragment_bottom_tab_community, null);
        return community_fragment;
    }
}