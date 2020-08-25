package com.example.breakoutdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewMeetingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_meeting);

        Button CompleteButton = (Button)findViewById(R.id.CompleteButton);
        CompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent complete = new Intent(NewMeetingActivity.this, TaskPageActivity.class);
                startActivity(complete);
            }
        });
    }
}
