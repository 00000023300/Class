package com.example.aclass.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aclass.R;

public class WelcomeActivity extends AppCompatActivity {
private ListView lv;
private Button course,tool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        lv = findViewById(R.id.list_item);

        Intent intent = getIntent();
        TextView tv = findViewById(R.id.user);
        tv.setText(intent.getStringExtra("username"));

        course = findViewById(R.id.button1);
        tool = findViewById(R.id.button2);
        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(WelcomeActivity.this,ChooseActivity.class);
                 startActivity(intent);

            }
        });





    }
}
