package com.example.breakoutdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TaskPageActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_page);

        Button task_page = (Button) findViewById(R.id.taskpage);
        task_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent complete = new Intent(TaskPageActivity.this, MainActivity.class);
                startActivity(complete);
            }
        });
    }
}
