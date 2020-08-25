package com.example.breakoutdev;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class HomePageActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.home_page_fragment, new FragmentMainPage());

        ImageView community = (ImageView)findViewById(R.id.community_page);
        ImageView main = (ImageView)findViewById(R.id.main_page);
        ImageView settings = (ImageView)findViewById(R.id.settings_page);
        community.setOnClickListener(nav_tab);
        main.setOnClickListener(nav_tab);
        settings.setOnClickListener(nav_tab);
    }

    View.OnClickListener nav_tab = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Fragment nav_fragment = null;

            switch (view.getId()){
                case R.id.main_page:
                    nav_fragment = new FragmentMainPage();
                    break;
                case R.id.community_page:
                    nav_fragment = new FragmentCommunityPage();
                    break;
                case R.id.settings_page:
                    nav_fragment = new FragmentSettingsPage();
                    break;
                default:
                    break;
            }

            ft.replace(R.id.home_page_fragment, nav_fragment);
            ft.commit();
        }
    };
}
